package com.company;

import java.util.Scanner;

public class Habitacion  {
   private int numero;
   private boolean wc;
   private boolean regadera;
   private int nCamas;
   private boolean cable;
   private boolean serHab;
   private boolean wifi;
   private boolean jacucy;

    Habitacion(Scanner leer){
        this.numero=leer.nextInt();
        this.nCamas=leer.nextInt();
        this.wifi=leer.hasNextBoolean();
        this.cable=leer.hasNextBoolean();
        this.jacucy=leer.hasNextBoolean();
        this.regadera=leer.hasNextBoolean();
        this.serHab=leer.hasNextBoolean();
        this.wc=leer.hasNextBoolean();



    }


}
