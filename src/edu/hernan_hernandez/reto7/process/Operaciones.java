package edu.hernan_hernandez.reto7.process;

public class Operaciones {
    /**
     * Esta clase sirve para realizar los siguientes calculos:
     * Suma de dos nuemros
     **/
    public static double suma(double num1, double num2){
        return num1 + num2;
    }
    /**
     * Esta clase sirve para realizar los siguientes calculos:
     * Resta de dos nuemros
     **/
    public static double resta(double num1, double num2) {
        return num1 - num2;
    }
    /**
     * Esta clase sirve para realizar los siguientes calculos:
     * Multiplicacion de dos nuemros
     **/
    public static double multiplicacion(double num1, double num2) {
        return num1 * num2;
    }
    /**
     * Esta clase sirve para realizar los siguientes calculos:
     * Division de dos nuemros
     **/
    public static double division(double num1, double num2) {
        if (num2 != 0)
            return num1 / num2;
        else {
            System.out.println("No se puede dividir por cero.");
            return Double.NaN;
        }
    }
    /**
     * Esta clase sirve para realizar los siguientes calculos:
     * Modulo de dos nuemros
     **/
    public static double modulo(double num1, double num2) {
        if (num2 != 0)
            return num1 % num2;
        else {
            System.out.println("No se puede calcular el módulo con cero.");
            return Double.NaN;
        }
    }
    /**
     * Esta clase sirve para realizar los siguientes calculos:
     * Potencia de dos nuemros
     **/
    public static double potencia(double num1, double num2) {
        return Math.pow(num1, num2);
    }
    /**
     * Esta clase sirve para realizar los siguientes calculos:
     *Raiz cuadrada de un nuemro
     **/
    public static double raizCuadrada(double num) {
        if (num >= 0)
            return Math.sqrt(num);
        else {
            System.out.println("No se puede calcular la raíz cuadrada de un número negativo.");
            return Double.NaN;
        }
    }
    /**
     * Esta clase sirve para realizar los siguientes calculos:
     *Logaritmo natural de un nuemro
     **/
    public static double logaritmoNatural(double num) {
        if (num > 0)
            return Math.log(num);
        else {
            System.out.println("No se puede calcular el logaritmo de cero o números negativos.");
            return Double.NaN;
        }
    }
}
