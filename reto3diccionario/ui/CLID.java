package edu.hernan_hernandez.reto3diccionario.ui;

import edu.hernan_hernandez.reto3diccionario.process.AlmacendePalabras;

import java.util.Scanner;

public class CLID {

    public static void main() {
        Scanner scanner = new Scanner(System.in);
        char opcion;

        //Aqui se llama al menu para escoger las opciones
        do {
                mostrarMenu();
                opcion = scanner.next().charAt(0);
                switch (opcion) {
                    case 'A':
                        AlmacendePalabras.ingresarPalabras();
                        break;
                    case 'B':
                        AlmacendePalabras.buscarPalabras();
                        break;
                    case 'C':
                        AlmacendePalabras.detalleDiccionario();
                        break;
                    case 'S':
                        System.out.println("¡Hasta luego!");
                        break;
                    default:
                        System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                }
            } while (opcion != 'S');
        }

        //Aqui esta el menu para que el usuario escoga que hacer
        public static void mostrarMenu(){
            System.out.println("Diccionario: ");
            System.out.println("A. Enlistar palabras del diccionario");
            System.out.println("B. Buscar palabras en el diccionario");
            System.out.println("C. Detalle del diccionario");
            System.out.println("S. Finalizar programa");
            System.out.print("Seleccione una opción: ");
        }
}