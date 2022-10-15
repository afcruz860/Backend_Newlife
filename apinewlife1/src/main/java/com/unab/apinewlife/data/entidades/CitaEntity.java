package com.unab.apinewlife.data.entidades;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name= "cita")
public class CitaEntity implements Serializable {

    private static final long serialVersionUID=1l;

    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false)
    private String idCita;

    @Column(nullable = false)
    private String codigo;

    @Column(nullable = false)
    private Date fecha;

    @Column(nullable = false)
    private boolean asistencia;


    
    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getIdCita() {
        return this.idCita;
    }

    public void setIdCita(String idCita) {
        this.idCita = idCita;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Date getFecha() {
        return this.fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public boolean isAsistencia() {
        return this.asistencia;
    }

    public boolean getAsistencia() {
        return this.asistencia;
    }

    public void setAsistencia(boolean asistencia) {
        this.asistencia = asistencia;
    }
    
}
