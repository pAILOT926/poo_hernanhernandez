package edu.hernan_hernandez.evidencia1.ui;

import edu.hernan_hernandez.evidencia1.process.Registro;

import java.util.Scanner;

public class CLIF {
    static Scanner scanner = new Scanner(System.in);
    public static void MostrarMenu() {

        String nombreUsuarioCorrecto = "AL03100109";
        String contraseñaCorrecta = "03100109";
        String nombreUsuario;
        String contraseña;

        do {
            System.out.print("Ingrese su nombre de usuario: ");
            nombreUsuario = scanner.nextLine();
            System.out.print("Ingrese su contraseña: ");
            contraseña = scanner.nextLine();

            if (!nombreUsuario.equals(nombreUsuarioCorrecto) || !contraseña.equals(contraseñaCorrecta)) {
                System.out.println("Usuario o contraseña incorrectos, inténtelo de nuevo.");
            }
        } while (!nombreUsuario.equals(nombreUsuarioCorrecto) || !contraseña.equals(contraseñaCorrecta));

        System.out.println("Inicio de sesión exitoso. Bienvenido, " + nombreUsuario + "!");

        char opcion;
        do {
            menu();
            opcion = scanner.nextLine().charAt(0);
            switch (opcion) {
                case 'A':
                    Registro.Medicamento();
                    break;
                case 'B':
                    System.out.println("desarrollo");
                    break;
            }
        } while (opcion != 'B');
    }
    public static void menu(){
        System.out.println("Eliga una opcion: ");
        System.out.println("A. Registrar medicamento");
        System.out.println("B. Salir");
    }
}
