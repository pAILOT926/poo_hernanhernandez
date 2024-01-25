package edu.hernan_hernandez.reto1.ui;

import edu.hernan_hernandez.reto1.process.CalculadoraMasaCorporal;

import java.util.Scanner;

public class CLI {
    public static void verMenu(){

        //aqui hice el menu de opciones
        System.out.println("Eliga la opcion que desea de la calculadora: ");
        System.out.println("1. Indice de masa corporal");
        System.out.println("2. Masa corporal magra");
        System.out.println("3. Metabolismo basal");
        System.out.println("4. Salir");

        Scanner scanner = new Scanner(System.in);

        int opcion = scanner.nextInt();

        double resultado = 0;
        switch (opcion) {

            //calculadora de indice de masa corporal
            case 1:
                System.out.println("Estatura (en metros): ");
                double estaturamc = scanner.nextDouble();
                System.out.println("Peso (en kilogramos): ");
                double pesomc = scanner.nextDouble();
                double imc = CalculadoraMasaCorporal.calcularIndiceMasaCorporal(pesomc, estaturamc);
                System.out.println("imc " + imc);

                if (imc < 18) {
                    System.out.println("Peso bajo");
                } else if (imc <= 24) {
                    System.out.println("Peso normal");
                } else if (imc <= 29) {
                    System.out.println("Sobrepeso");
                } else if (imc <= 34) {
                    System.out.println("Obesidad leve");
                } else if (imc <= 39) {
                    System.out.println("Obesidad media");
                } else if (imc > 40) {
                    System.out.println("Obesidad morbida");
                }
                break;

                    //calculadora de indice de masa magra
                    case 2:
                        System.out.println("Estatura (en centimetros): ");
                        double estaturamm = scanner.nextDouble();
                        System.out.println("Peso (en kilogramos): ");
                        double pesomm = scanner.nextDouble();

                        //para saber el genero lo declare "int" para poder usar if
                        System.out.println("Genero (1. hombre o 2. mujer): ");
                        int genero = scanner.nextByte();

                        //aqui uso el if para hacer los calculos de acuerdo con el genero
                        if (genero == 1) {
                            double imm = CalculadoraMasaCorporal.calcularIndiceMasaMagraHombre(pesomm, estaturamm);
                            System.out.println("imm: " + imm);
                        }else if (genero == 2) {
                            double imm = CalculadoraMasaCorporal.calcularIndiceMasaMagraMujer(pesomm, estaturamm);
                            System.out.println("imm: " + imm);
                        }
                        break;

                        //calcualdora del metabolismo basal
                        case 3:
                            System.out.println("Estatura (en centimetros): ");
                            double estaturamb = scanner.nextDouble();
                            System.out.println("Peso (en kilogramos): ");
                            double pesomb = scanner.nextDouble();
                            System.out.println("Genero (1. hombre o 2. mujer): ");

                            //para saber el genero lo declare "int" para poder usar if
                            int generomb = scanner.nextByte();
                            System.out.println("Edad: ");
                            double edad = scanner.nextDouble();

                            //aqui uso el if para hacer los calculos de acuerdo con el genero
                            if (generomb == 1) {
                                double imm = CalculadoraMasaCorporal.calcularMetabolismoBasalHombre(pesomb, estaturamb, edad);
                                System.out.println("imm: " + imm);
                            }else if (generomb == 2) {
                                double imm = CalculadoraMasaCorporal.calcularMetabolismoBasalMujer(pesomb, estaturamb, edad);
                                System.out.println("imm: " + imm);
                            }
                            break;

                            //Salir de la aplicacion
            case 4:
                System.exit(0);
                break;
        }
    }
}