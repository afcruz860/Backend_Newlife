package com.newlife.apinewlife.models.peticiones;

public class UsuarioCrearRequestModel {

    private String nombre;
    private String rol;
    private String telefono;
    private String ciudad;
    private String departamento;
    private String direccion;
    private String eps;
    private String telefonoemergencia;
    private String email;
    private String username;
    private String password;


    public String getRol() {
        return this.rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCiudad() {
        return this.ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDepartamento() {
        return this.departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEps() {
        return this.eps;
    }

    public void setEps(String eps) {
        this.eps = eps;
    }

    public String getTelefonoemergencia() {
        return this.telefonoemergencia;
    }

    public void setTelefonoemergencia(String telefonoemergencia) {
        this.telefonoemergencia = telefonoemergencia;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
