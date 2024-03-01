package edu.hernan_hernandez.reto2cajas.ui;


import edu.hernan_hernandez.reto2cajas.process.Calculadoradecajas;

import java.util.Scanner;

import java.util.Scanner;

public class CLIC {
    public static void watchmenu() {
        Scanner scanner = new Scanner(System.in);
        RegistroVentas registroVentas = new RegistroVentas();

        //Aqui se pide el usuario y contraseña
        System.out.println("Ingrese usuario:");
        String usuario = scanner.next();
        System.out.println("Ingrese su contraseña:");
        double contraseña = scanner.nextDouble();

        //Aqui se muestran las opciones
        do {
            System.out.println("Buenas que desea hacer: ");
            System.out.println("1. Comprar cajas de papel");
            System.out.println("2. Vender cajas de papel");
            System.out.println("3. Mostrar reporte");
            System.out.println("4. Salir");

            int opcion = scanner.nextInt();

            //Aqui es donde se ingresan los datos
            switch (opcion) {
                case 1:
                    System.out.println("¿Cuántas cajas desea comprar?");
                    double cajacompra = scanner.nextDouble();
                    System.out.println("¿Cuál será el costo de las cajas?");
                    double cajacosto = scanner.nextDouble();
                    registroVentas.agregarCompra(cajacompra, cajacosto);
                    break;

                case 2:
                    System.out.println("¿Cuántas cajas desea vender?");
                    double cajaventa = scanner.nextDouble();
                    System.out.println("¿Cuál será el precio a vender de las cajas?");
                    double cajaprecio = scanner.nextDouble();
                    registroVentas.agregarVenta(cajaventa, cajaprecio);
                    break;

                case 3:
                    registroVentas.mostrarReporte();
                    break;

                case 4:
                    registroVentas.mostrarReporte();
                    System.out.println("Que tenga buen día.");
                    break;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
            if (opcion == 4) {
                break;
            }
        } while (true);
    }
}

//Aqui es donde se realiza la opcion 3 y 4
class RegistroVentas {
    private double compraTotal = 0;
    private double ventaTotal = 0;

    public void agregarCompra(double cantidad, double costo) {
        compraTotal += cantidad * costo;
        System.out.println("Compra registrada: " + cantidad + " cajas al costo de " + costo);
    }

    public void agregarVenta(double cantidad, double precio) {
        ventaTotal += cantidad * precio;
        System.out.println("Venta registrada: " + cantidad + " cajas al precio de " + precio);
    }

    public void mostrarReporte() {
        System.out.println("Total de ventas: " + ventaTotal);
        System.out.println("Total de compras: " + compraTotal);
        System.out.println("Ingresos generados por ventas: " + ventaTotal);
        System.out.println("Ingresos generados por compras: " + compraTotal);
        System.out.println("Monto en la caja: " + (ventaTotal + compraTotal));
    }
}
