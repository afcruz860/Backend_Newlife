package com.newlife.apinewlife.models.peticiones;

public class MedicamentoCrearRequestModel {
    private String codigo;
    private String nombre;
    private String presentacion;

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPresentacion() {
        return this.presentacion;
    }

    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }
     
    

}
