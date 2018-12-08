package Habitaciones;

import java.util.Scanner;

public class Ejecutiva extends Habitacion {
    private String cable;
    private String serHab;
    private String wifi;
    private String wc;
    private String regadera;

    public Ejecutiva(Scanner leer) {
        super(leer);
        this.wifi=leer.next();
        this.cable=leer.next();
        this.regadera=leer.next();
        this.serHab=leer.next();
        this.wc=leer.next();
    }
    public String toString() {
        return "Ejecutiva \t" +
                " cable " + cable +
                " serHab " + serHab +
                " wifi " + wifi +
                " wc " + wc +
                " regadera " + regadera ;
    }
}
