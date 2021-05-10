package co.com.bancolombia.ecopagos.domain;

import co.com.bancolombia.ecopagos.utils.Constants;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigInteger;
import java.util.Date;

@Data
@Entity
@Table(name = "tbl_psf_montos", schema = Constants.SCHEMA_DATABASE)
public class TblPsfMontosModel {

    @Id
    @Column(name = "monto_id")
    private Integer monto_id;

    @Column(name = "tipo")
    private String tipo;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "transaccion_id")
    private Integer transaccion_id;

    @Column(name = "valor")
    private BigInteger valor;

    @Column(name = "created_at")
    private Date created_at;

    @Column(name = "updated_at")
    private Date updated_at;
}
