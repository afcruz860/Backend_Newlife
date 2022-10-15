package com.newlife.apinewlife.models.peticiones;

import java.sql.Date;

public class CitaCrearRequestModel {
    private String codigo;
    private Date fecha;
    private boolean asistencia;

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
