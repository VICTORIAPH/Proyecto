package Usuarios;

import Habitaciones.Habitacion;

import java.util.Scanner;

public class Usuario {
    private String correo;
    private String pass;
    private String nombre;
    private Habitacion reservaciones;

    public Usuario(Scanner leer) {
        this.nombre = leer.next();
        this.correo = leer.next();
        this.pass = leer.next();
    }
    public void reservar(){

    }
    public void cancelar(){

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
