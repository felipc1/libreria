package co.com.bancolombia.ecopagos.domain;

import co.com.bancolombia.ecopagos.utils.Constants;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Entity
@Table(name = "tbl_psf_respuestas", schema = Constants.SCHEMA_DATABASE)
public class TblPsfRespuestasModel {

    @Id
    @Column(name = "respuesta_id")
    private Integer seguimiento_id;

    @Column(name = "codigo")
    private String codigo;

    @Column(name = "respuesta_tecnica")
    private String respuesta_tecnica;

    @Column(name = "respuesta_funcional")
    private String respuesta_funcional;

    @Column(name = "transaccion_id")
    private Integer transaccion_id;

    @Column(name = "created_at")
    private Date created_at;

    @Column(name = "updated_at")
    private Date updated_at;
}
