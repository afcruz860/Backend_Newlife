package com.newlife.apinewlife.models.peticiones;

import java.sql.Date;

public class ExamenesCrearRequestModel {


    private String codigo;
    private Date fecha;
    private String areaEspecialista;


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

    public String getAreaEspecialista() {
        return this.areaEspecialista;
    }

    public void setAreaEspecialista(String areaEspecialista) {
        this.areaEspecialista = areaEspecialista;
    }
    
}
