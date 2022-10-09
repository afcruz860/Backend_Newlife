package com.newlife.apinewlife.shared;

import java.io.Serializable;
import java.sql.Date;

public class HclinicaDto implements Serializable {

    private static final long serialVersionUID=1L;

    private long id;
    private String idHclinica;
    private String nombre;
    private String cedula;
    private Date fecha;
    private String consulta;
    private String genero;
    private String telefono;
    private String correo;
    private String eps;
    private String notasMedicas;
    private String medicamentosF;
    private String examenesF;


    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getIdHclinica() {
        return this.idHclinica;
    }

    public void setIdHclinica(String idHclinica) {
        this.idHclinica = idHclinica;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return this.cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public Date getFecha() {
        return this.fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getConsulta() {
        return this.consulta;
    }

    public void setConsulta(String consulta) {
        this.consulta = consulta;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return this.correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getEps() {
        return this.eps;
    }

    public void setEps(String eps) {
        this.eps = eps;
    }

    public String getNotasMedicas() {
        return this.notasMedicas;
    }

    public void setNotasMedicas(String notasMedicas) {
        this.notasMedicas = notasMedicas;
    }

    public String getMedicamentosF() {
        return this.medicamentosF;
    }

    public void setMedicamentosF(String medicamentosF) {
        this.medicamentosF = medicamentosF;
    }

    public String getExamenesF() {
        return this.examenesF;
    }

    public void setExamenesF(String examenesF) {
        this.examenesF = examenesF;
    }
    
   
    
}
