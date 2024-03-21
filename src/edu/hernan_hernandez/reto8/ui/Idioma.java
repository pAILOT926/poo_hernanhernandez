package edu.hernan_hernandez.reto8.ui;

import java.util.Scanner;

public class Idioma {
    public static void idioma(){
        Scanner scanner = new Scanner(System.in);

        // Aqui se solicita al usuario usar el idioma
        System.out.println("Seleccione el idioma (Español: 'esp', English: 'eng'): ");
        String idiomaSeleccionado = scanner.nextLine().trim().toLowerCase();

        switch (idiomaSeleccionado) {
            case "esp":
                CLIOESP.mirarmenu();
                break;
            case "eng":
                CLIOENG.mirarmenu();
                break;
        }
    }
}
