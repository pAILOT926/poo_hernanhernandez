package edu.hernan_hernandez.evidencia2.ui;

import edu.hernan_hernandez.evidencia2.process.ArticulosESP;
import java.util.List;
import java.util.Scanner;

public class CLITESP {
    public static void sesion() {
        //Inicio de sesion
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su matricula institucional: ");
        String usuario = scanner.nextLine();

        System.out.println("Bienvenido a TecmiFlix, " + usuario + "\n Esto es lo que consumió alrededor del mes: ");

        // Mostrar la lista de productos consumidos y el costo total
        List<ArticulosESP.Producto> productosConsumidos = ArticulosESP.ConsumoAleatorio();
        double costoTotal = ArticulosESP.calcularCostoTotal(productosConsumidos);

        // Mostrar los detalles
        for (ArticulosESP.Producto producto : productosConsumidos) {
            System.out.println("- " + producto.nombre + ": $" + producto.calcularCosto());
        }

        // Mostrar el costo total a pagar
        System.out.println("\nEl total es: $" + costoTotal);

        scanner.close();
    }
}

