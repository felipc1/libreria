package co.com.bancolombia.domain;

import com.fasterxml.jackson.databind.util.JSONPObject;

import javax.persistence.Column;
import javax.persistence.Id;
import java.util.Date;

public class TblPsfSeguimientosModel {

    @Id
    @Column(name = "seguimiento_id")
    private Integer seguimiento_id;

    @Column(name = "tipo")
    private String tipo;

    @Column(name = "codigo_rastreo")
    private String codigo_rastreo;

    @Column(name = "codigo_operacion")
    private String codigo_operacion;

    @Column(name = "transaccion_id")
    private Integer transaccion_id;

    @Column(name = "es_cancelacion")
    private Integer es_cancelacion;

    @Column(name = "created_at")
    private Date created_at;

    @Column(name = "updated_at")
    private Date updated_at;
}
