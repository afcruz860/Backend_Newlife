package com.newlife.apinewlife.models.respuestas;

import java.sql.Date;

public class CitaDataRestModel {

    private String idCita;
    private String codigo;
    private Date fecha;
    private boolean asistencia;

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
