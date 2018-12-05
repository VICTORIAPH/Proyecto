package com.company;

import java.util.Scanner;

public class Economica extends Habitacion {
    private String cable;
    private String serHab;
    private String wifi;
    private String wc;
    private String regadera;

    Economica(Scanner leer) {
        super(leer);
        this.wifi=leer.next();
        this.cable=leer.next();
        this.regadera=leer.next();
        this.serHab=leer.next();
        this.wc=leer.next();
    }

    @Override
    public String toString() {
        return "Economica \t" +
                " cable " + cable +
                " serHab " + serHab +
                " wifi " + wifi +
                " wc " + wc +
                " regadera " + regadera ;
    }
}
