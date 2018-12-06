package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
private static ArrayList <Habitacion> habs =  new ArrayList<>();
private static Scanner teclado = new Scanner(System.in);
private static Scanner leer;
    public static void main(String[] args) throws FileNotFoundException {
        menu();
    }

    private static void menu() throws FileNotFoundException {
        teclado = new Scanner(System.in);
        llenadoDeBase();
        System.out.printf("1 Tipo de habitaciones");
        System.out.printf(" 2 Ingresa   ");
        System.out.printf("9 Salir");
        int opcion = teclado.nextInt();
        switch (opcion){
            case 1: tiposDeHabitaciones();  break;
            case 2: login();                break;
            case 9 :                        break;
        }
    }

    private static boolean login() throws FileNotFoundException {
        boolean usuario;
        File login = new File("login.dat");
        String correo, password;
        System.out.printf("Ingrese correo");
            correo = teclado.next();
        System.out.printf("Ingrese ocntraseña");
            correo = teclado.next();

        if (true) {

        }
        return false;
    }

    private static void tiposDeHabitaciones() {

        for (Habitacion i:habs) {
            System.out.println(i);
        }
    }

    public static void llenadoDeBase() throws FileNotFoundException {
        File habitaciones=new File("Habitacion.txt");
        leer=new Scanner(habitaciones);

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
