package edu.hernan_hernandez.reto8.ui;

import edu.hernan_hernandez.reto8.process.OperacionesESP;

import java.util.Scanner;
public class CLIOESP {

    public static void mirarmenu() {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

            while (!salir) {

                //Ingreso de los numeros
                double num1, num2;
                System.out.println("Ingrese el primer número:");
                num1 = scanner.nextDouble();
                System.out.println("Ingrese el segundo número:");
                num2 = scanner.nextDouble();

                //Seleccion de operacion
                System.out.println("Seleccione la operación a realizar:\n" +
                        "1. Suma\n" +
                        "2. Resta\n" +
                        "3. Multiplicación\n" +
                        "4. División\n" +
                        "5. Módulo\n" +
                        "6. Potencia\n" +
                        "7. Raíz cuadrada (sobre el primer número)\n" +
                        "8. Logaritmo natural (base e) (sobre el primer número)\n" +
                        "9. Salir");
                int opcion = scanner.nextInt();

                //Se selecciona la opcion y se dirige a Operaciones
                switch (opcion) {
                    case 1:
                        System.out.println("La suma es: " + OperacionesESP.suma(num1, num2));
                        break;
                    case 2:
                        System.out.println("La resta es: " + OperacionesESP.resta(num1, num2));
                        break;
                    case 3:
                        System.out.println("La multiplicación es: " + OperacionesESP.multiplicacion(num1, num2));
                        break;
                    case 4:
                        System.out.println("La división es: " + OperacionesESP.division(num1, num2));
                        break;
                    case 5:
                        System.out.println("El módulo es: " + OperacionesESP.modulo(num1, num2));
                        break;
                    case 6:
                        System.out.println("La potencia es: " + OperacionesESP.potencia(num1, num2));
                        break;
                    case 7:
                        System.out.println("La raíz cuadrada es: " + OperacionesESP.raizCuadrada(num1));
                        break;
                    case 8:
                        System.out.println("El logaritmo natural es: " + OperacionesESP.logaritmoNatural(num1));
                        break;

                        //Si se requiere salir
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