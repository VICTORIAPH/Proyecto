package com.company;

import java.util.Scanner;

public class Economica extends Habitacion {
    private boolean cable;
    private boolean serHab;
    private boolean wifi;
    private boolean jacucy;
    private boolean wc;
    private boolean regadera;

    Economica(Scanner leer) {
        super(leer);
        this.wifi=leer.hasNextBoolean();
        this.cable=leer.hasNextBoolean();
        this.jacucy=leer.hasNextBoolean();
        this.regadera=leer.hasNextBoolean();
        this.serHab=leer.hasNextBoolean();
        this.wc=leer.hasNextBoolean();
    }

}
