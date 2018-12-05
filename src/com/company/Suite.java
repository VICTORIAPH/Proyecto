package com.company;

import java.util.Scanner;

public class Suite extends Habitacion {
    private boolean cable;
    private boolean serHab;
    private boolean wifi;
    private boolean wc;
    private boolean regadera;

    public Suite(Scanner leer) {
        super(leer);
        this.wifi=leer.hasNextBoolean();
        this.cable=leer.hasNextBoolean();
        this.regadera=leer.hasNextBoolean();
        this.serHab=leer.hasNextBoolean();
        this.wc=leer.hasNextBoolean();
    }
}
