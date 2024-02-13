package edu.hernan_hernandez.reto3diccionario.process;

import edu.hernan_hernandez.reto3diccionario.ui.CLID;

import java.awt.*;
import java.util.Scanner;
/**
 * Esta clase sirve para realizar los siguientes procesos:
 * Almacenar las palabras
 * Ingresar las palabras
 * Buscar las palabras
 * Mostrar detalles del diccionario
 **/
public class AlmacendePalabras {
    private static final int longitud = 10;
    private static String[] palabras = new String[longitud];
    private static String[] significados = new String[longitud];
    private static Scanner scanner = new Scanner(System.in);

    /**
     * Metodo para ingresar las palabras
     * palabras ingresadas
     * significados ingresados
     */
    public static void ingresarPalabras(){

        for (int i = 0; i < longitud; i++){
        System.out.println("Ingrese la palabra: ");
        palabras[i] = scanner.next();
        System.out.println("Ingrese su significado: ");
        significados[i] = scanner.next();
        }
        System.out.println("10 palabras (maximo) ingresadas correctamente");
    }

    /**
     * Metodo para buscar las palabras
     * palabras almacenadas
     * significados almacenados
     */
    public static void buscarPalabras() {
        for (int i = 0; i < palabras.length; i++) {
            System.out.println("Aqui estan las palabras: ");
            System.out.println(palabras[i] + significados[i]);
        }
    }

    /**
     * Metodo para mostrar los detalles del diccionario
     * numero de palabras ingresados
     * palabras ingrsadas
     * significados ingresados
     */
    public static void detalleDiccionario(){
        System.out.println("Detalles del diccionario: ");
        System.out.println("Cantidad de palabras: "+ palabras.length);

        for (int i = 0; i < palabras.length; i++) {
            System.out.println("Aqui estan las palabras: ");
            System.out.println(palabras[i] + significados[i]);
        }
    }
}
