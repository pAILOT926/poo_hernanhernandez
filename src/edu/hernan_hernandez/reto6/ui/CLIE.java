package edu.hernan_hernandez.reto6.ui;

import edu.hernan_hernandez.reto6.process.Reporte;

import java.util.Scanner;

public class CLIE {
    private Scanner scanner;
    private Reporte reporte;

    public CLIE() {
        this.scanner = new Scanner(System.in);
        this.reporte = new Reporte();
    }

    public void mostrarMenu() {
        int opcion;
        do {
            System.out.println("Menú:");
            System.out.println("1. Capturar empleados");
            System.out.println("2. Generar reporte de nómina");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    reporte.capturarEmpleados();
                    break;
                case 2:
                    reporte.generarReporte();
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida, intente de nuevo.");
                    break;
            }
        } while (opcion != 0);
        scanner.close();
    }
}