package com.company;

public class Usuario {
    private String correo;
    private String pass;
    private String nombre;

    Usuario(String nombre, String correo, String password) {
        this.nombre = nombre;
        this.correo = correo;
        this.nombre = password;

    }

    public String getCorreo() {
        return correo;
    }

    public String getPass() {
        return pass;
    }

    public String getNombre() {
        return nombre;
    }
}
