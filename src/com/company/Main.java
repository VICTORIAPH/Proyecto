package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        File habitaciones=new File("Habitacion.txt");
        Scanner leer=new Scanner(habitaciones);

        ArrayList <Habitacion> habs =  new ArrayList<>();

        for (Habitacion h : habs) {
            String tipo = leer.next();
            if (tipo.equalsIgnoreCase("e")) {
                habs.add(new Economica(leer));
            }
        }
    }
}
