package co.com.bancolombia.domain;

import co.com.bancolombia.utils.Constants;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;


@Data
@Entity
@Table(name = "tbl_psf_movimientos", schema = Constants.SCHEMA_DATABASE)
public class TblPsfMovimientosModel {

    @Id
    @Column(name = "movimiento_id")
    private Integer movimiento_id;

    @Column(name = "no_producto")
    private String no_producto;

    @Column(name = "tipo_producto")
    private String tipo_producto;

    @Column(name = "no_dcto_titular")
    private String no_dcto_titular;

    @Column(name = "tipo_dcto_titular")
    private String tipo_dcto_titular;

    @Column(name = "transaccion_id")
    private Integer transaccion_id;

    @Column(name = "tipo_movimiento")
    private String tipo_movimiento;

    @Column(name = "nombre_cliente")
    private String nombre_cliente;

    @Column(name = "created_at")
    private Date created_at;

    @Column(name = "updated_at")
    private Date updated_at;
}
