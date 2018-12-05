package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
private static ArrayList <Habitacion> habs =  new ArrayList<>();
private static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) throws FileNotFoundException {
        menu();
    }

    private static void menu() throws FileNotFoundException {

        llenadoDeBase();
        System.out.printf("1 Tipo de habitaciones");
        int opcion = teclado.nextInt();
        switch (opcion){
            case 1: tiposDeHabitaciones();
        }
    }

    private static void tiposDeHabitaciones() {

        for (Habitacion i:habs) {
            System.out.println(i);
        }
    }

    public static void llenadoDeBase() throws FileNotFoundException {
        File habitaciones=new File("Habitacion.txt");
        Scanner leer=new Scanner(habitaciones);

        while (leer.hasNext()){
            String tipo=leer.next();
            if (tipo.equalsIgnoreCase("e")) {
                habs.add(new Economica(leer));
            }
            if (tipo.equalsIgnoreCase("t")) {
                habs.add(new Tradicional(leer));
            }
            if (tipo.equalsIgnoreCase("ej")) {
                habs.add(new Ejecutiva(leer));
            }
            if (tipo.equalsIgnoreCase("s")) {
                habs.add(new Suite(leer));
            }
            if (tipo.equalsIgnoreCase("sp")) {
                habs.add(new SuitePrecidencial(leer));
            }

        }
    }


}
