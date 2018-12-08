package Habitaciones;

import java.util.Scanner;

public class SuitePrecidencial extends Suite {
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
}
