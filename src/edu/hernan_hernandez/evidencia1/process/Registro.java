package edu.hernan_hernandez.evidencia1.process;

import edu.hernan_hernandez.reto4boletosdebus.process.Almacenamiento;

import java.util.ArrayList;
import java.util.Scanner;

import static edu.hernan_hernandez.reto3diccionario.ui.CLID.mostrarMenu;

public class Registro {

    String nombreUsuarioCorrecto = "AL03100109";
    String contraseñaCorrecta = "03100109";
    String nombreUsuario;
    String contraseña;
    public static ArrayList<Medicamento> medicamentos = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);

    public static class Medicamento{
        private String nombrequimico;
        private String nombregenerico;
        private String nombreregistrado;
        private double preciopublico;
        private double precioventa;

        public Medicamento(String nombrequimico, String nombregenerico, String nombreregistrado, double preciopublico, double precioventa){
            this.nombregenerico = nombregenerico;
            this.nombrequimico = nombrequimico;
            this.nombreregistrado = nombreregistrado;
            this.preciopublico = preciopublico;
            this.precioventa = precioventa;
        }
        public String getNombrequimico(){
            return nombrequimico;
        }
        public String getNombregenerico(){
            return nombregenerico;
        }
        public String getNombreregistrado(){
            return nombreregistrado;
        }
        public double getPreciopublico(){
            return  preciopublico;
        }
        public double getPrecioventa(){
            return precioventa;
        }
        public static void registronombre(){

        }
    }
}
