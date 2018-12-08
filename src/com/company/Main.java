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
        menuPrincipal();
    }

    private static void menuPrincipal() throws FileNotFoundException {
        teclado = new Scanner(System.in);
        llenadoDeBase();
        System.out.printf("1 Tipo de habitaciones");
        System.out.printf(" 2 Ingresa   ");
        System.out.printf("9 Salir");

            int opcion = teclado.nextInt();
            switch (opcion){
                case 1: tiposDeHabitaciones();
                        menuPrincipal();
                        System.out.flush();
                                                        break;
                case 2: login();
                System.out.flush();
                        menuPrincipal();
                        System.out.flush();
                                                        break;
                case 9 :
                    System.out.printf("Hasta Pronto!");
                                                        break;
            }
    }

    private static void login() throws FileNotFoundException {

        File login = new File("login.dat"); //Cargo el login.dat a una variable File
        leer = new Scanner(login);  //cago la variable 'login' en el scanner
        ArrayList <Usuario> baseCorreos= new ArrayList<>(); //Base de datos de correos y contraseñas

        for (Usuario i: baseCorreos) {
            /*
            Lleno mi base de objetos de tipo Usuarios, y leo los atributos
            nombre, correo y contraseña
            */
            baseCorreos.add(new Usuario(leer.next(), leer.next(), leer.next()));
        }
        /* Estas variables son para almacenar los datos con
        los que el usuario se va a logear en el sistema
        */
        String correo, password;
        System.out.printf("Ingrese correo");
            correo = teclado.next();
        System.out.printf("Ingrese ocntraseña");
            password = teclado.next();

        for (int i = 0; i < baseCorreos.size(); i++) {  //Recorro mi ArrayList
            /*Con este IF comparo lo que ingrese el usuario con cada
                objeto y sus respectivos correos y contraseñas
             */

            if (correo.equalsIgnoreCase(baseCorreos.get(i).getCorreo()) &&
                password.equalsIgnoreCase(baseCorreos.get(i).getPass()))
            {
                System.out.println("Bienvenido" + baseCorreos.get(i).getNombre());
                menuUsuario();
            }
        }
    }

    private static void menuUsuario() throws FileNotFoundException {

        menuPrincipal();
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
