package edu.hernan_hernandez.reto4boletosdebus.process;

import edu.hernan_hernandez.reto4boletosdebus.ui.CLIB;

import java.util.ArrayList;
import java.util.Scanner;

public class Almacenamiento {

    //Se crean las ArrayList para guardar los datos
    public static ArrayList<Venta> ventas = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);
    public static final double COSTO_BOLETO = 1250.50;
    public static class Venta {
        private String nombreComprador;
        private int cantidadBoletos;
        private String[] nombresPasajeros;
        private double totalVenta;

        public Venta(String nombreComprador, int cantidadBoletos, String[] nombresPasajeros, double totalVenta) {
            this.nombreComprador = nombreComprador;
            this.cantidadBoletos = cantidadBoletos;
            this.nombresPasajeros = nombresPasajeros;
            this.totalVenta = totalVenta;
        }

        public String getNombreComprador() {
            return nombreComprador;
        }

        public int getCantidadBoletos() {
            return cantidadBoletos;
        }

        public String[] getNombresPasajeros() {
            return nombresPasajeros;
        }

        public double getTotalVenta() {
            return totalVenta;
        }
    }
    /**
     * Aqui se realizan los siguientes procesos:
     * Venta de boletos
     * Nombre del comprador
     * Boletos a comprar
     * Total
     **/
    public static void ventadeBoletos() {
        System.out.println("Ingrese el nombre completo del comprador:");
        String nombreComprador = scanner.nextLine();
        System.out.println("Ingrese la cantidad de boletos a comprar:");
        int cantidadBoletos = scanner.nextInt();
        scanner.nextLine();

        String[] nombresPasajeros = new String[cantidadBoletos - 1];
        for (int i = 0; i < cantidadBoletos - 1; i++) {
            System.out.println("Ingrese el nombre completo del pasajero " + (i + 1) + ":");
            nombresPasajeros[i] = scanner.nextLine();
        }

        double totalVenta = cantidadBoletos * COSTO_BOLETO;
        ventas.add(new Venta(nombreComprador, cantidadBoletos, nombresPasajeros, totalVenta));

        System.out.println("Ticket de venta:");
        System.out.println("Nombre del comprador: " + nombreComprador);
        System.out.println("Cantidad de boletos: " + cantidadBoletos);
        for (int i = 0; i < cantidadBoletos - 1; i++) {
            System.out.println("Nombre del pasajero " + (i + 1) + ": " + nombresPasajeros[i]);
        }
        System.out.println("Total: $" + totalVenta);
    }

    /**
     * Aqui se realizan los siguientes procesos:
     * La lista de ventas
     * Nombre del comprador
     * Cantidad de boletos
     * Total
     **/
    public static void listadeVentas() {
        System.out.println("----- Lista de Ventas -----");
        for (Venta venta : ventas) {
            System.out.println("Nombre del comprador: " + venta.getNombreComprador());
            System.out.println("Cantidad de boletos: " + venta.getCantidadBoletos());
            for (int i = 0; i < venta.getNombresPasajeros().length; i++) {
                System.out.println("Nombre del pasajero " + (i + 1) + ": " + venta.getNombresPasajeros()[i]);
            }
            System.out.println("Total: $" + venta.getTotalVenta());
        }
        System.out.println("Total de boletos vendidos: " + calcularTotalBoletos());
        System.out.println("Total de pasajeros registrados: " + calcularTotalPasajeros());
        System.out.println("Total recaudado: $" + calcularTotalRecaudado());
    }

    /**
     * Aqui se realizan los siguientes procesos:
     * Calcular el total de boletos
     * Calcular el total de pasajeros
     * Calcular total recaudado
     **/
    public static int calcularTotalBoletos() {
        int totalBoletos = 0;
        for (Venta venta : ventas) {
            totalBoletos += venta.getCantidadBoletos();
        }
        return totalBoletos;
    }

    public static int calcularTotalPasajeros() {
        int totalPasajeros = 0;
        for (Venta venta : ventas) {
            totalPasajeros += venta.getNombresPasajeros().length + 1;
        }
        return totalPasajeros;
    }

    public static double calcularTotalRecaudado() {
        double totalRecaudado = 0;
        for (Venta venta : ventas) {
            totalRecaudado += venta.getTotalVenta();
        }
        return totalRecaudado;
    }
}
