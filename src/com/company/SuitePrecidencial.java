package com.company;

import java.util.Scanner;

public class SuitePrecidencial extends Suite {
private String jacuzy;
    SuitePrecidencial(Scanner leer) {
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
