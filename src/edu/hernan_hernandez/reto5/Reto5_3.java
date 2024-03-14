package edu.hernan_hernandez.reto5;

public class Reto5_3 {
    public class ArticuloSupermercado {
        private String nombre;
        private double precioUnitario;
        private int cantidad;

        public ArticuloSupermercado(String nombre, double precioUnitario, int cantidad) {
            this.nombre = nombre;
            this.precioUnitario = precioUnitario;
            this.cantidad = cantidad;
        }

        public double calcularTotal() {
            return precioUnitario * cantidad;
        }
    }
}
