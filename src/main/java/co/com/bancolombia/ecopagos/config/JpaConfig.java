package co.com.bancolombia.ecopagos.config;

import co.com.bancolombia.secretsmanager.api.GenericManager;
import co.com.bancolombia.secretsmanager.connector.AWSSecretManagerConnector;
import co.com.bancolombia.secretsmanager.model.AWSSecretDBModel;
import co.com.bancolombia.ecopagos.utils.secrets.DBSecret;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

import javax.sql.DataSource;
import java.util.Properties;

@Configuration
public class JpaConfig {

    @Bean
    public DBSecret dbSecret(@Value("${aws.region}") String region, @Value("${aws.secretManager.secret-name}") String secretName) {
        GenericManager connector = new AWSSecretManagerConnector(region);
        try {
            AWSSecretDBModel secret = connector.getSecret(secretName, AWSSecretDBModel.class);
            final String url = "jdbc:postgresql://"
                    .concat(secret.getHost())
                    .concat(":")
                    .concat(secret.getPort())
                    .concat("/")
                    .concat(secret.getDbname());
            return DBSecret.builder()
                    .url(url)
                    .username(secret.getUsername())
                    .password(secret.getPassword())
                    .build();
        } catch (Exception e) {
            return null;
        }
    }

    @Bean
    public DataSource datasource(DBSecret secret, @Value("${spring.datasource.driverClassName}") String driverClass) {
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl(secret.getUrl());
        config.setUsername(secret.getUsername());
        config.setPassword(secret.getPassword());
        config.setDriverClassName(driverClass);
        return new HikariDataSource(config);
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource dataSource, @Value("${spring.jpa.databasePlatform}") String dialect) {
        LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
        em.setDataSource(dataSource);
        em.setPackagesToScan("co.com.bancolombia.ecopagos.domain");

        em.setJpaVendorAdapter(new HibernateJpaVendorAdapter());

        Properties properties = new Properties();
        properties.setProperty("hibernate.dialect", dialect);
        em.setJpaProperties(properties);

        return em;
    }
}