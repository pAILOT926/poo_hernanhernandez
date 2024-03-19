package edu.hernan_hernandez.reto8.ui;

import edu.hernan_hernandez.reto8.process.OperacionesENG;
import edu.hernan_hernandez.reto8.process.OperacionesESP;

import java.util.Scanner;

public class CLIOENG {

    public static void mirarmenu() {
        Textos textos = new Eng();
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

            while (!salir) {

                //Ingreso de los numeros
                double num1, num2;
                System.out.println(textos.NUMEROUNO);
                num1 = scanner.nextDouble();
                System.out.println(textos.NUMERODOS);
                num2 = scanner.nextDouble();

                //Seleccion de operacion
                System.out.println(textos.OPERACION);
                int opcion = scanner.nextInt();

                //Se selecciona la opcion y se dirige a Operaciones
                switch (opcion) {
                    case 1:
                        System.out.println(textos.SUMA + OperacionesENG.suma(num1, num2));
                        break;
                    case 2:
                        System.out.println(textos.RESTA + OperacionesENG.resta(num1, num2));
                        break;
                    case 3:
                        System.out.println(textos.MULTIPLICACION + OperacionesENG.multiplicacion(num1, num2));
                        break;
                    case 4:
                        System.out.println(textos.DIVISION + OperacionesENG.division(num1, num2));
                        break;
                    case 5:
                        System.out.println(textos.MODULO + OperacionesENG.modulo(num1, num2));
                        break;
                    case 6:
                        System.out.println(textos.POTENCIA + OperacionesENG.potencia(num1, num2));
                        break;
                    case 7:
                        System.out.println(textos.RAIZ + OperacionesENG.raizCuadrada(num1));
                        break;
                    case 8:
                        System.out.println(textos.LOGARITMO + OperacionesENG.logaritmoNatural(num1));
                        break;

                        //Si se requiere salir
                    case 9:
                        salir = true;
                        break;
                    default:
                        System.out.println(textos.NOVALIDA);
                }
            }
            System.out.println(textos.BYE);
    }
}