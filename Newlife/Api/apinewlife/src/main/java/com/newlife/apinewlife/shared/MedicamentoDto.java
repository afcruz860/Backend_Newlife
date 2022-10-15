package com.newlife.apinewlife.shared;

import java.io.Serializable;

public class MedicamentoDto implements Serializable{
    private static final long serialVersionUID = 1L;
    
    private long id;
    private String idMedicamento;
    private String codigo;
    private String nombre;
    private String presentacion;


    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getIdMedicamento() {
        return this.idMedicamento;
    }

    public void setIdMedicamento(String idMedicamento) {
        this.idMedicamento = idMedicamento;
    }

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
