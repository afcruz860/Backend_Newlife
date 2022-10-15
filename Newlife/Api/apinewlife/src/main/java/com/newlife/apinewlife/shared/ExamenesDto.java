package com.newlife.apinewlife.shared;

import java.io.Serializable;
import java.sql.Date;

public class ExamenesDto implements Serializable {

    private static final long serialVersionUID=1L;

    private long id;
    private String idCliente;
    private String codigo;
    private Date fecha; 
    private String areaEspecialista;
    

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getIdCliente() {
        return this.idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
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

    public String getAreaEspecialista() {
        return this.areaEspecialista;
    }

    public void setAreaEspecialista(String areaEspecialista) {
        this.areaEspecialista = areaEspecialista;
    }

}
