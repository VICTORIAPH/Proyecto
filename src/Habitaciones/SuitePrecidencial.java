package Habitaciones;

import java.util.Scanner;

public class SuitePrecidencial extends Suite implements Operaciones2 {
private String jacuzy;
    public SuitePrecidencial(Scanner leer) {
        super(leer);
        this.jacuzy = leer.next();

    }
    public String toString() {
        return "Suite Precidencial \t" +
                " cable " + cable +
                " serHab " + serHab +
                " wifi " + wifi +
                " wc " + wc +
                " regadera " + regadera +
                " jacuzy " + jacuzy;
    }

    public double calcularPrecio() {
        return getPrecio()*5;
    }
}
