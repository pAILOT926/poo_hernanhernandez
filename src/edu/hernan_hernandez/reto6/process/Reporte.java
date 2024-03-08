package edu.hernan_hernandez.reto6.process;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Reporte {
    private List<Empleado> empleados;
    private Scanner scanner;

    public Reporte() {
        this.empleados = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    public void capturarEmpleados() {
        System.out.print("Ingrese la cantidad de empleados a capturar: ");
        int cantidadEmpleados = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < cantidadEmpleados; i++) {
            System.out.println("Datos del Empleado " + (i + 1) + ":");
            System.out.print("Nombre completo: ");
            String nombreCompleto = scanner.nextLine();
            System.out.print("Horas trabajadas: ");
            int horasTrabajadas = scanner.nextInt();
            System.out.print("Horas extras trabajadas: ");
            int horasExtras = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Teléfono: ");
            String telefono = scanner.nextLine();
            System.out.print("Fecha de nacimiento: ");
            String fechaNacimiento = scanner.nextLine();

            Categoria categoria;
            do {
                System.out.print("Categoría (empleado ventas, administrador o gerente): ");
                String categoriaInput = scanner.nextLine();
                categoria = Categoria.obtenerCategoria(categoriaInput);
                if (categoria == null) {
                    System.out.println("Categoría no válida, intente de nuevo.");
                }
            } while (categoria == null);

            Empleado empleado = new Empleado(nombreCompleto, horasTrabajadas, horasExtras, telefono, fechaNacimiento, categoria);
            empleados.add(empleado);
        }
    }

    public void generarReporte() {
        System.out.println("\n--- Reporte de Nómina ---");
        System.out.println("Total de la nómina de la empresa: $" + calcularTotalNomina());
        System.out.println("Total a pagar por sueldo normal: $" + calcularTotalSueldoNormal());
        System.out.println("Total a pagar por horas extras: $" + calcularTotalHorasExtras());
        System.out.println("Total de horas laboradas en la empresa: " + calcularTotalHorasLaboradas());
        System.out.println("Total de personas que tienen horas extras: " + totalPersonasConHorasExtras());
        System.out.println("Total de personas que no tienen horas extras: " + totalPersonasSinHorasExtras());
    }

    private double calcularTotalNomina() {
        double total = 0;
        for (Empleado empleado : empleados) {
            total += empleado.getCategoria().getSueldoBase() * empleado.getHorasTrabajadas();
            total += empleado.getCategoria().getPagoHoraExtra() * empleado.getHorasExtras();
        }
        return total;
    }

    private double calcularTotalSueldoNormal() {
        double total = 0;
        for (Empleado empleado : empleados) {
            total += empleado.getCategoria().getSueldoBase() * empleado.getHorasTrabajadas();
        }
        return total;
    }

    private double calcularTotalHorasExtras() {
        double total = 0;
        for (Empleado empleado : empleados) {
            total += empleado.getCategoria().getPagoHoraExtra() * empleado.getHorasExtras();
        }
        return total;
    }

    private int calcularTotalHorasLaboradas() {
        int total = 0;
        for (Empleado empleado : empleados) {
            total += empleado.getHorasTrabajadas() + empleado.getHorasExtras();
        }
        return total;
    }

    private int totalPersonasConHorasExtras() {
        int count = 0;
        for (Empleado empleado : empleados) {
            if (empleado.getHorasExtras() > 0) {
                count++;
            }
        }
        return count;
    }

    private int totalPersonasSinHorasExtras() {
        return empleados.size() - totalPersonasConHorasExtras();
    }

    public class Empleado {
        private String nombreCompleto;
        private int horasTrabajadas;
        private int horasExtras;
        private String telefono;
        private String fechaNacimiento;
        private Categoria categoria;

        public Empleado(String nombreCompleto, int horasTrabajadas, int horasExtras, String telefono, String fechaNacimiento, Categoria categoria) {
            this.nombreCompleto = nombreCompleto;
            this.horasTrabajadas = horasTrabajadas;
            this.horasExtras = horasExtras;
            this.telefono = telefono;
            this.fechaNacimiento = fechaNacimiento;
            this.categoria = categoria;
        }

        public String getNombreCompleto() {
            return nombreCompleto;
        }

        public int getHorasTrabajadas() {
            return horasTrabajadas;
        }

        public int getHorasExtras() {
            return horasExtras;
        }

        public String getTelefono() {
            return telefono;
        }

        public String getFechaNacimiento() {
            return fechaNacimiento;
        }

        public Categoria getCategoria() {
            return categoria;
        }
    }

    public static class Categoria {
        private String nombre;
        private String clave;
        private double sueldoBase;
        private double pagoHoraExtra;

        public Categoria(String nombre, String clave, double sueldoBase, double pagoHoraExtra) {
            this.nombre = nombre;
            this.clave = clave;
            this.sueldoBase = sueldoBase;
            this.pagoHoraExtra = pagoHoraExtra;
        }

        public String getNombre() {
            return nombre;
        }

        public String getClave() {
            return clave;
        }

        public double getSueldoBase() {
            return sueldoBase;
        }

        public double getPagoHoraExtra() {
            return pagoHoraExtra;
        }

        public static Categoria obtenerCategoria(String nombre) {
            switch (nombre.toLowerCase()) {
                case "empleado ventas":
                    return new Categoria("Empleado ventas", "EV", 100.00, 50.00);
                case "administrador":
                    return new Categoria("Administrador", "ADM", 180.00, 100.00);
                case "gerente":
                    return new Categoria("Gerente", "GER", 250.00, 150.00);
                default:
                    return null;
            }
        }
    }
}