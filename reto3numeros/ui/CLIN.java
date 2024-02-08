package edu.hernan_hernandez.reto3numeros.ui;

import edu.hernan_hernandez.reto3numeros.process.CalculadoradeNumeros;

import java.util.Scanner;

import static edu.hernan_hernandez.reto3numeros.process.CalculadoradeNumeros.*;

public class CLIN {

    public static void mirarMenu() {

        Scanner scanner = new Scanner(System.in);
        int n;
        int m;

        //Aqui se pide al usuario el ingreso de datos
        do {
            System.out.println("Ingrese la cantidad de filas: ");
            n = scanner.nextInt();
            System.out.println("Ingrese el numero de columnas (debe ser igual a la cantidad de filas): ");
            m = scanner.nextInt();
        } while (n != m);

        //Se registran los datos
        int[][] arreglo = CalculadoradeNumeros.generarArreglo(n, m);
        int[] paresfila = new int[n];
        int[] imparesfila = new int[n];
        int[] parescolumna = new int[m];
        int[] imparescolumna = new int[m];

        //Aqui se llaman los procesos
        CalculadoradeNumeros.contarParesImpares(arreglo, paresfila, imparesfila, parescolumna, imparescolumna);
        CalculadoradeNumeros.mostrarResultado(paresfila, imparesfila, parescolumna, imparescolumna);
        CalculadoradeNumeros.suma(arreglo);
    }
}