package edu.hernan_hernandez.reto3diccionario.process;

import edu.hernan_hernandez.reto3diccionario.ui.CLID;

import java.awt.*;
import java.util.Scanner;

public class AlmacendePalabras {

    public static void ingresarPalabras(){
        Scanner scanner = new Scanner(System.in);

        final int longitud_vector = 18;
        double[] vectorp = new double[longitud_vector];
        double[] vectors = new double[longitud_vector];

        for (int i = 0; i < 18; i++){

            System.out.println("Ingrese la palabra: ");
            vectorp[i] = scanner.nextDouble();
            System.out.println("Ingrese el significado: ");
            vectors[i] = scanner.nextDouble();
        }
        System.out.println("Solo se aceptan 10 palabras, puede continuar");
        CLID menu = new CLID();
        menu.mostrarMenu();
    }
}
