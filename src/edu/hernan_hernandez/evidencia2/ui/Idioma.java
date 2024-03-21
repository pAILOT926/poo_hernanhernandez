package edu.hernan_hernandez.evidencia2.ui;

import java.util.Scanner;

public class Idioma {
    public static void idioma(){
        Scanner scanner = new Scanner(System.in);

        // Aqui se solicita al usuario usar el idioma
        System.out.println("Seleccione el idioma (Español: 'esp', English: 'eng'): ");
        String idiomaSeleccionado = scanner.nextLine().trim().toLowerCase();

        switch (idiomaSeleccionado) {
            case "esp":
                CLITESP.sesion();
                break;
            case "eng":
                CLITENG.sesion();
                break;
        }
    }
}