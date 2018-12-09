package Habitaciones;

import java.util.Scanner;

public class Suite extends Habitacion implements Operaciones2{
    protected String cable;
    protected String serHab;
    protected String wifi;
    protected String wc;
    protected String regadera;

    public Suite(Scanner leer) {
        super(leer);
        this.wifi=leer.next();
        this.cable=leer.next();
        this.regadera=leer.next();
        this.serHab=leer.next();
        this.wc=leer.next();
    }

    public String toString() {
        return "Suite \t" +
                " cable " + cable +
                " serHab " + serHab +
                " wifi " + wifi +
                " wc " + wc +
                " regadera " + regadera ;
    }


    @Override
    public double calcularPrecio() {
        return getPrecio()*3;
    }
}
