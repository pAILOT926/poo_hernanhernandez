package edu.hernan_hernandez.reto1.process;

import java.util.Scanner;

/**
 * Esta clase sirve para realizar los siguientes calculos:
 * indice de masa corporal
 * masa corporal magra
 * metabolismo basal
 **/
public class CalculadoraMasaCorporal {
    /**
     * Metodo para calcular el indice de masa corporal
     * @param estaturamc en m
     * @param pesomc en kg
     * @return indice de masa corporal
     */

    public static double calcularIndiceMasaCorporal(double pesomc, double estaturamc) {
        return pesomc / Math.pow(estaturamc, 2);
    }
    /**
     * Metodo para calcular el indice de masa magra del hombre
     * @param estaturamm en cm
     * @param pesomm en kg
     * @return indice de masa magra de hombre
     */
    public static double calcularIndiceMasaMagraHombre(double pesomm, double estaturamm) {
        return (1.10 * pesomm) - 128 * (Math.pow(pesomm, 2)) / (Math.pow(estaturamm, 2));
    }
    /**
     * Metodo para calcular el indice de masa magra de la mujer
     * @param estaturamm en cm
     * @param pesomm en kg
     * @return indice de masa magra de mujer
     */
    public static double calcularIndiceMasaMagraMujer(double pesomm, double estaturamm) {
        return (1.07 * pesomm) - 148 * (Math.pow(pesomm, 2)) / (Math.pow(estaturamm, 2));
    }
    /**
     * Metodo para calcular el indice de metabolismo basal del hombre
     * @param estaturamb en cm
     * @param pesomb en kg
     * @param edad del usuario
     * @return indice de metabolismo basal de hombre
     */
    public static double calcularMetabolismoBasalHombre(double pesomb, double estaturamb, double edad) {
        return 66.5 + (13.75 * pesomb) + (5.003 * estaturamb) - (6.775 * edad);
    }
    /**
     * Metodo para calcular el indice de metabolismo basal de la mujer
     * @param estaturamb en cm
     * @param pesomb en kg
     * @param edad del usuario
     * @return indice de metabolismo basal de mujer
     */
    public static double calcularMetabolismoBasalMujer(double pesomb, double estaturamb, double edad) {
        return 655.1 + (9.563 * pesomb) + (1.85 * estaturamb) - (4.676 * edad);
    }
}

