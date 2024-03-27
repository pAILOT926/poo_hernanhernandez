package edu.hernan_hernandez.reto7.ui;
import edu.hernan_hernandez.reto7.process.Operaciones;

import java.util.Scanner;
public class CLIO {

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

                //Se selecciona la opcion y se dirige a Operaciones
                switch (opcion) {
                    case 1:
                        System.out.println("La suma es: " + Operaciones.suma(num1, num2));
                        break;
                    case 2:
                        System.out.println("La resta es: " + Operaciones.resta(num1, num2));
                        break;
                    case 3:
                        System.out.println("La multiplicación es: " + Operaciones.multiplicacion(num1, num2));
                        break;
                    case 4:
                        System.out.println("La división es: " + Operaciones.division(num1, num2));
                        break;
                    case 5:
                        System.out.println("El módulo es: " + Operaciones.modulo(num1, num2));
                        break;
                    case 6:
                        System.out.println("La potencia es: " + Operaciones.potencia(num1, num2));
                        break;
                    case 7:
                        System.out.println("La raíz cuadrada es: " + Operaciones.raizCuadrada(num1));
                        break;
                    case 8:
                        System.out.println("El logaritmo natural es: " + Operaciones.logaritmoNatural(num1));
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