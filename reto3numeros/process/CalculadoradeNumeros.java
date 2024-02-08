package edu.hernan_hernandez.reto3numeros.process;

/**
 * Esta clase sirve para realizar los siguientes procesos:
 * Generar el arreglo
 * Contar los pares e impares
 * Mostrar el resultado
 * Resultado de toda la suma
 **/
public class CalculadoradeNumeros {

    /**
     * Aqui se realizan los siguientes procesos:
     * Generar el arreglo
     **/
    public static int[][] generarArreglo(int n, int m) {
        int[][] arreglo = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arreglo[i][j] = (int) (Math.random() * 100) + 1;
            }
        }
        return arreglo;
    }

    /**
     * Aqui se realizan los siguientes procesos:
     * Contar los pares e impares
     **/
    public static void contarParesImpares(int[][] arreglo, int[] paresfila, int[] imparesfila, int[] parescolumna, int[] imparescolumna) {
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[i].length; j++) {
                if (arreglo[i][j] % 2 == 0) {
                    paresfila[i]++;
                    parescolumna[j]++;
                } else {
                    imparesfila[i]++;
                    imparescolumna[j]++;
                }
            }
        }
    }

    /**
     * Aqui se realizan los siguientes procesos:
     * Muestra el resultado
     **/
    public static void mostrarResultado(int[] paresfila, int[] imparesfila, int[] parescolumna, int[] imparescolumna) {
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

    /**
     * Aqui se realizan los siguientes procesos:
     * Resultado de la suma de todos
     **/
    public static void suma(int[][] arreglo) {
        int total = 0;
        for (int[] fila : arreglo) {
            for (int valor : fila) {
                total += valor;
            }
        }
        System.out.println("\nLa suma total en el arreglo es: " + total);
    }
}