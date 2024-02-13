package edu.hernan_hernandez.reto3diccionario.ui;

import edu.hernan_hernandez.reto3diccionario.process.AlmacendePalabras;

import java.util.Scanner;

public class CLID {

    public static void mostrarMenu(){
        Scanner scanner = new Scanner(System.in);
        String opcion;

        do {
            System.out.println("Diccionario: ");
            System.out.println("A. enlistar palabras del diccionario");
            System.out.println("B. buscar palabras en el diccionario");
            System.out.println("C. detalle del diccionario");
            System.out.println("S. finalizar programa");

            opcion = scanner.nextLine().toLowerCase();

            switch (opcion) {
                case "A":
                    AlmacendePalabras.ingresarPalabras();
                    break;
                case "S":
                    break;
            }
            if (opcion == "S");
            break;
        }while (true);
        CLID menu = new CLID();
        menu.mostrarMenu();
    }
}
