package co.com.bancolombia.domain;

import co.com.bancolombia.utils.Constants;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigInteger;
import java.util.Date;

@Data
@Table(name = "tbl_cod_rastreo_invalido", schema = Constants.SCHEMA_DATABASE)
@Entity
public class TblCodRastreoInvalidosModel {

    @Id

    @Column(name = "codigo_rastreo")
    private String codigo_rastreo;

    @Column(name = "tipo")
    private String tipo;

    @Column(name = "fecha")
    private Date fecha;

    @Column(name = "cantidad")
    private Integer cantidad;
}
