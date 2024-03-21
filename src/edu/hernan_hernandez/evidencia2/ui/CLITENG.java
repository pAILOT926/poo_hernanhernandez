package edu.hernan_hernandez.evidencia2.ui;

import edu.hernan_hernandez.evidencia2.process.ArticulosESP;

import java.util.List;
import java.util.Scanner;

public class CLITENG {
    public static void sesion() {
        Textos textos = new ENG();
        //Inicio de sesion
        Scanner scanner = new Scanner(System.in);
        System.out.println(textos.INICIO_SESION);
        String usuario = scanner.nextLine();

        System.out.println(textos.BIENVENIDA + usuario + textos.BIENVENIDA_2);

        // Mostrar la lista de productos consumidos y el costo total
        List<ArticulosESP.Producto> productosConsumidos = ArticulosESP.ConsumoAleatorio();
        double costoTotal = ArticulosESP.calcularCostoTotal(productosConsumidos);

        // Mostrar los detalles
        for (ArticulosESP.Producto producto : productosConsumidos) {
            System.out.println("- " + producto.nombre + ": $" + producto.calcularCosto());
        }

        // Mostrar el costo total a pagar
        System.out.println(textos.PAGAR + costoTotal);

        scanner.close();
    }
}

