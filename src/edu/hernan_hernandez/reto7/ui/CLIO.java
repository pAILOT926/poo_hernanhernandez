package edu.hernan_hernandez.reto7.ui;
import java.util.Scanner;
public class CLIO {

    public static void mirarmenu() {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

            while (!salir) {
                double num1, num2;
                System.out.println("Ingrese el primer número:");
                num1 = scanner.nextDouble();
                System.out.println("Ingrese el segundo número:");
                num2 = scanner.nextDouble();

                System.out.println("Seleccione la operación a realizar:");
                System.out.println("1. Suma");
                System.out.println("2. Resta");
                System.out.println("3. Multiplicación");
                System.out.println("4. División");
                System.out.println("5. Módulo");
                System.out.println("6. Potencia");
                System.out.println("7. Raíz cuadrada (sobre el primer número)");
                System.out.println("8. Logaritmo natural (base e) (sobre el primer número)");
                System.out.println("9. Salir");
                int opcion = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    case 6:
                        break;
                    case 7:
                        break;
                    case 8:
                        break;
                    case 9:
                        salir = true;
                        break;
                    default:
                        System.out.println("Opción inválida.");
                }
            }
            System.out.println("Adios");
    }
}