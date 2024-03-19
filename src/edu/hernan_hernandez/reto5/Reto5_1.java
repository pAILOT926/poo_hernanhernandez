package edu.hernan_hernandez.reto5;

public class Reto5_1 {
    public class PropiedadInmobiliaria {
        private String ubicacionGeografica;
        private String tipo;
        private double precio;
        private double tamaño;
        private int numHabitaciones;

        public PropiedadInmobiliaria(String ubicacionGeografica, String tipo, double precio, double tamaño, int numHabitaciones) {
            this.ubicacionGeografica = ubicacionGeografica;
            this.tipo = tipo;
            this.precio = precio;
            this.tamaño = tamaño;
            this.numHabitaciones = numHabitaciones;
        }

        public void obtenerDetalles() {
            //Detalles de la propiedad
        }

        public double calcularDistancia() {
            //Calcular la distancia
            return 0.0; //Distancia calculada
        }
    }
}
