package edu.hernan_hernandez.reto2cajas.process;

import java.util.Scanner;

public class Calculadoradecajas {

    //Aqui se realiza los calculos para generar el reporte
    public static double compradecajas (double cajacompra, double cajacosto) {
        return (cajacompra*cajacosto);
    }

    public static double ventadecajas (double cajaventa, double cajaprecio){
        return (cajaventa*cajaprecio);
    }
    public static double reporteventa (double compratotal, double ventatotal){
        return (compratotal + ventatotal);
    }

}
