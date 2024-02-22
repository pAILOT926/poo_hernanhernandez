package edu.hernan_hernandez.evidencia1.process;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Registro {
    String nombreUsuarioCorrecto = "AL03100109";
    String contraseñaCorrecta = "03100109";
    static String nombreUsuario;
    String contraseña;
    public static ArrayList<Medicamento> medicamentos = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);

    public static class Medicamento{
        private String nombreQuimico;
        private String nombreGenerico;
        private String nombreRegistrado;
        private double precioPublico;
        private double precioVenta;
        private String tipoPresentacion;

        public Medicamento(String nombreQuimico, String nombreGenerico, String nombreRegistrado, double precioPublico, String tipoPresentacion){
            this.nombreQuimico = nombreQuimico;
            this.nombreGenerico = nombreGenerico;
            this.nombreRegistrado = nombreRegistrado;
            this.precioPublico = precioPublico;
            this.tipoPresentacion = tipoPresentacion;
            this.calcularPrecioVenta();
        }

        public String getNombreQuimico(){
            return nombreQuimico;
        }

        public String getNombreGenerico(){
            return nombreGenerico;
        }

        public String getNombreRegistrado(){
            return nombreRegistrado;
        }

        public double getPrecioPublico(){
            return precioPublico;
        }

        public double getPrecioVenta(){
            return precioVenta;
        }

        public String getTipoPresentacion(){
            return tipoPresentacion;
        }

        private void calcularPrecioVenta() {
            switch (tipoPresentacion) {
                case "solidas":
                    precioVenta = precioPublico * 1.09;
                    break;
                case "solidas semisolidas":
                    precioVenta = precioPublico * 1.12;
                    break;
                case "solidas liquidas":
                    precioVenta = precioPublico * 1.13;
                    break;
                default:
                    System.out.println("Tipo de presentación no válido.");
            }
        }
    }
    /**
     * Aqui se realizan los siguientes procesos:
     * Registro del nombre quimico
     * Registro del nombre generico
     * Registro del nombre registrado
     * Registrar el precio al publico
     * Registrar el tipo de presentacion
     **/
    public static void registroMedicamentos() {
        String opcion;
        do {
            System.out.println("Ingrese los datos del medicamento:");
            System.out.print("Nombre químico: ");
            String nombreQuimico = scanner.nextLine();
            System.out.print("Nombre genérico: ");
            String nombreGenerico = scanner.nextLine();
            System.out.print("Nombre registrado: ");
            String nombreRegistrado = scanner.nextLine();
            System.out.print("Precio al público: ");
            double precioPublico = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("Tipo de presentación (solidas/solidas semisolidas/solidas liquidas): ");
            String tipoPresentacion = scanner.nextLine();

            Medicamento medicamento = new Medicamento(nombreQuimico, nombreGenerico, nombreRegistrado, precioPublico, tipoPresentacion);
            medicamentos.add(medicamento);

            System.out.print("¿Desea agregar otro medicamento? (si/no): ");
            opcion = scanner.nextLine();
        } while (!opcion.equalsIgnoreCase("no"));

        //En caso de seleccionar no
        System.out.println("Reporte:");
        System.out.println("Nombre de quien registró los artículos: " + nombreUsuario);
        System.out.println("Fecha de generación del reporte: " + LocalDate.now());
        System.out.println("Cantidad de productos en la lista: " + medicamentos.size());
        System.out.println("Desglose de los medicamentos:");

        for (Medicamento med : medicamentos) {
            System.out.println("Nombre químico: " + med.getNombreQuimico());
            System.out.println("Nombre genérico: " + med.getNombreGenerico());
            System.out.println("Nombre registrado: " + med.getNombreRegistrado());
            System.out.println("Precio al público: " + med.getPrecioPublico());
            System.out.println("Precio de venta: " + med.getPrecioVenta());
            System.out.println("Tipo de presentación: " + med.getTipoPresentacion());
            System.out.println("-----------------------------------");
        }
    }
    public static void main(String[] args) {
        Registro registro = new Registro();
        registro.registroMedicamentos();
    }

    /**
     * Aqui se realizan los siguientes procesos:
     * Generar el reporte al finalizar el programa
     **/
    public static void generarReporte(String nombreUsuario) {
        System.out.println("Reporte:");
        System.out.println("Nombre de quien registró los artículos: " + nombreUsuario);
        System.out.println("Fecha de generación del reporte: " + LocalDate.now());
        System.out.println("Cantidad de productos en la lista: " + medicamentos.size());
        System.out.println("Desglose de los medicamentos:");

        for (Medicamento med : medicamentos) {
            System.out.println("Nombre químico: " + med.getNombreQuimico());
            System.out.println("Nombre genérico: " + med.getNombreGenerico());
            System.out.println("Nombre registrado: " + med.getNombreRegistrado());
            System.out.println("Precio al público: " + med.getPrecioPublico());
            System.out.println("Precio de venta: " + med.getPrecioVenta());
            System.out.println("Tipo de presentación: " + med.getTipoPresentacion());
            System.out.println("-----------------------------------");
        }
    }
}