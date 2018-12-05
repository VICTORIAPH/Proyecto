package com.company;

import java.util.Scanner;

public class Habitacion  {
   private int numero;
   private int nCamas;
   private double precio = 300.0D;

   Habitacion(Scanner leer){
        this.numero=leer.nextInt();
        this.nCamas=leer.nextInt();
   }

    public int getNumero() {
        return numero;
    }

    public int getnCamas() {
        return nCamas;
    }

    public double getPrecio() {
        return precio;
    }
}
