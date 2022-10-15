package com.newlife.apinewlife.data.entidades;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;




@Entity (name= "examenes")
public class ExamenesEntity implements Serializable {

    private static final long serialVersionUID=1L;
 
    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false)
    private String idCliente;


    @Column(nullable = false)
    private String codigo;

    @Column(nullable = false)
    private Date fecha; 

    @Column(nullable = false)
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
