package edu.hernan_hernandez.reto3numeros.ui;

import edu.hernan_hernandez.reto3numeros.process.CalculadoradeNumeros;

import java.util.Scanner;

import static edu.hernan_hernandez.reto3numeros.process.CalculadoradeNumeros.*;

public class CLIN {

    public static void mirarMenu() {

        Scanner scanner = new Scanner(System.in);
        int n;
        int m;

        do{
            System.out.println("Ingrese la cantidad de filas: ");
            n = scanner.nextInt();
            System.out.println("Ingrese el numero de columnas (debe ser igual a la cantidad de filas): ");
            m = scanner.nextInt();
        }while (n != m);

        int[][] arreglo = arreglofinal(n, m);
        int[] paresfila = new int[n];
        int[] imparesfila = new int[n];
        int[] parescolumna = new int[m];
        int[] imparescolumna = new int[m];

        CalculadoradeNumeros.ContarParesImpares(arreglo, paresfila, imparesfila, parescolumna,imparescolumna);
        CalculadoradeNumeros.mostrarResultado(paresfila, imparesfila, parescolumna, imparescolumna);
        CalculadoradeNumeros.suma(arreglo);
    }
}
