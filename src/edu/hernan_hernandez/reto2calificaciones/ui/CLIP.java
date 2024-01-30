package edu.hernan_hernandez.reto2calificaciones.ui;

import edu.hernan_hernandez.reto2calificaciones.process.Promedio;

import java.util.Scanner;

public class CLIP {
    public static void mirarMenu(){

        System.out.println("Buenas, ¿Cuantas calificaciones desea capturar?");
        Scanner scanner = new Scanner(System.in);
        int cantidad = scanner.nextInt();

        double[] calificaciones = new double[cantidad];

        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese la o sus calificaciones" + (i + 1) + ":");
            calificaciones[i] = scanner.nextDouble();
        }
        System.out.println("Calificaciones ingresados: ");
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Calificacion: " + (i + 1) + ": " + calificaciones[i]);

            double suma = 0;
            for (int i1 = 0; i < cantidad; i++); {
                suma += calificaciones[i];

                double promedio = Promedio.promedioDeCalificaciones(calificaciones[i], suma);
                System.out.println("El promedio del alumno es: " + promedio);
            }
        }
    }
}
