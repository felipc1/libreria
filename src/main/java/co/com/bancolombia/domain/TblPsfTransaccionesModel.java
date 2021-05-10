package co.com.bancolombia.domain;

import co.com.bancolombia.utils.Constants;
import com.fasterxml.jackson.databind.util.JSONPObject;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Entity
@Table(name = "tbl_psf_transacciones", schema = Constants.SCHEMA_DATABASE)

public class TblPsfTransaccionesModel {

    @Id
    @Column(name = "transaccion_id")
    private Integer transaccion_id;

    @Column(name = "is_comercio")
    private String is_comercio;

    @Column(name = "tipo")
    private String tipo;

    @Column(name = "metodo_pago")
    private String metodo_pago;

    @Column(name = "canal")
    private String canal;

    @Column(name = "codigo_operacion")
    private String codigo_operacion;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "referencia")
    private String referencia;

    @Column(name = "estado")
    private String estado;

    @Column(name = "no_oficina_trx")
    private String no_oficina_trx;

    @Column(name = "hora_fecha")
    private Date hora_fecha;

//    @Column(name = "metadata")
//    private JSONPObject metadata;

    @Column(name = "created_at")
    private Date created_at;

    @Column(name = "updated_at")
    private Date updated_at;

    @Column(name = "referencia_pagador")
    private String referencia_pagador;

}
