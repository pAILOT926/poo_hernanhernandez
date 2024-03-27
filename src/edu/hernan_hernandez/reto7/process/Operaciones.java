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
        double resultado = 0.0;
        boolean esNegativo = (num1 < 0 && num2 > 0) || (num1 > 0 && num2 < 0);
        num1 = Math.abs(num1);
        num2 = Math.abs(num2);

        for (int i = 0; i < num2; i++) {
            resultado += num1;
        }

        if (esNegativo) {
            resultado = -resultado;
        }

        return resultado;
    }
    /**
     * Esta clase sirve para realizar los siguientes calculos:
     * Division de dos nuemros
     **/
    public static double division(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("No se puede dividir por cero.");
            return Double.NaN;
        }

        double resultado = 0.0;
        boolean esNegativo = (num1 < 0 && num2 > 0) || (num1 > 0 && num2 < 0);
        num1 = Math.abs(num1);
        num2 = Math.abs(num2);

        while (num1 >= num2) {
            num1 -= num2;
            resultado++;
        }

        if (esNegativo) {
            resultado = -resultado;
        }

        return resultado;
    }
    /**
     * Esta clase sirve para realizar los siguientes calculos:
     * Modulo de dos nuemros
     **/
    public static double modulo(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("No se puede calcular el módulo con cero.");
            return Double.NaN;
        }

        double resultado = 0.0;
        boolean esNegativo = (num1 < 0 && num2 > 0) || (num1 > 0 && num2 < 0);
        num1 = Math.abs(num1);
        num2 = Math.abs(num2);

        while (num1 >= num2) {
            num1 -= num2;
        }

        resultado = num1;

        if (esNegativo) {
            resultado = -resultado;
        }

        return resultado;
    }
    /**
     * Esta clase sirve para realizar los siguientes calculos:
     * Potencia de dos nuemros
     **/
    public static double potencia(double base, double exponente) {
        if (exponente == 0)
            return 1;

        double resultado = base;
        boolean esNegativo = exponente < 0;
        exponente = Math.abs(exponente);

        for (int i = 1; i < exponente; i++) {
            resultado *= base;
        }

        if (esNegativo) {
            resultado = 1 / resultado;
        }

        return resultado;
    }
    /**
     * Esta clase sirve para realizar los siguientes calculos:
     *Raiz cuadrada de un nuemro
     **/
    public static double raizCuadrada(double num) {
        if (num < 0) {
            System.out.println("No se puede calcular la raíz cuadrada de un número negativo.");
            return Double.NaN;
        }

        double resultado = 0.0;
        double incremento = 0.1;

        while (resultado * resultado < num) {
            resultado += incremento;
        }

        if (resultado * resultado > num) {
            resultado -= incremento;
            incremento /= 10;
        }

        return resultado;
    }
    /**
     * Esta clase sirve para realizar los siguientes calculos:
     *Logaritmo natural de un nuemro
     **/
    public static double logaritmoNatural(double num) {
        if (num <= 0) {
            System.out.println("No se puede calcular el logaritmo de cero o números negativos.");
            return Double.NaN;
        }

        double resultado = 0.0;
        double x = (num - 1) / (num + 1);

        for (int i = 1; i <= 1000; i += 2) {
            resultado += (1.0 / i) * potencia(x, i);
        }

        resultado *= 2;

        return resultado;
    }
}
