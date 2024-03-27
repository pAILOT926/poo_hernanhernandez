package edu.hernan_hernandez.reto3numeros.process;

import java.util.Scanner;

public class CalculadoradeNumeros {

    Scanner scanner = new Scanner(System.in);
    public static int[][] arreglofinal (int n, int m){

        int[][] arreglo = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arreglo[i][j] = (int) (Math.random() * 100) + 1;
            }
        }
        return arreglo;
    }

    public static void ContarParesImpares(int arreglo, int paresfila, int imparesfila, int parescolumna, int imparescolumna){
        for (int i = 0; i < arreglo.length; i++){
            for (int j = 0; j < arreglo[i].length; j++){
                if(arreglo[i][j] = % 2 == 0){
                    paresfila[i]++;
                    parescolumna[j]++;
                } else {
                    parescolumna[i]++;
                    imparescolumna[j]++;
                }
            }
        }
    }

    public static void mostrarResultado(int paresfila, int imparesfila, int parescolumna, int imparescolumna){
        System.out.println("Conteo de números pares e impares:");
        System.out.println("Por filas:");
        for (int i = 0; i < paresfila.length; i++) {
            System.out.printf("Fila %d: Pares: %d, Impares: %d%n", i + 1, paresfila[i], imparesfila[i]);
        }
        System.out.println("\nPor columnas:");
        for (int i = 0; i < parescolumna.length; i++) {
            System.out.printf("Columna %d: Pares: %d, Impares: %d%n", i + 1, parescolumna[i], imparescolumna[i]);
        }
    }

    public static void suma (int[][] arreglo){
        int total = 0;
        for (int[] fila : arreglo) {
            for (int valor : fila) {
                total += valor;
            }
        }
        System.out.println("\nLa suma total en el arreglo es: " + total);
    }
}

