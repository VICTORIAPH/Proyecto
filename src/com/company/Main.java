package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        File habitaciones=new File("Habitacion.txt");
        Scanner leer=new Scanner(habitaciones);
Habitacion nueva=new Habitacion(leer);
    }
}
