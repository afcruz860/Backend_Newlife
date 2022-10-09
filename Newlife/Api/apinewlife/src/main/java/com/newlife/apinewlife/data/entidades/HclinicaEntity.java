package com.newlife.apinewlife.data.entidades;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "historiaClinica")
public class HclinicaEntity {

    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false)
    private String idHclinica;

    @Column(nullable = false, length = 20)
    private String nombre;

    @Column(nullable = false, length = 20)
    private String cedula;

    @Column(nullable = false)
    private Date fecha;

    @Column(nullable = false, length = 20)
    private String consulta;

    @Column(nullable = false, length = 20)
    private String genero;

    @Column(nullable = false, length = 20)
    private String telefono;

    @Column(nullable = false, length = 30)
    private String correo;

    @Column(nullable = false, length = 20)
    private String eps;

    @Column(nullable = false, length = 500)
    private String notasMedicas;

    @Column(nullable = false, length = 30)
    private String medicamentosF;

    @Column(nullable = false, length = 30)
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
