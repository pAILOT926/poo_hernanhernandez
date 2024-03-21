package edu.hernan_hernandez.evidencia2.process;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ArticulosENG {
    /**
     * Esta clase sirve para realizar los siguientes procesos:
     * Genera los detalles del producto
     **/
    public static abstract class Producto {
        public String nombre;
        protected String tipo;
        protected double costoBase;
        protected String genero;
        protected boolean esEstreno;

        public Producto(String nombre, String tipo, double costoBase, String genero, boolean esEstreno) {
            this.nombre = nombre;
            this.tipo = tipo;
            this.costoBase = costoBase;
            this.genero = genero;
            this.esEstreno = esEstreno;
        }

        public abstract double calcularCosto();
    }
    /**
     * Esta clase sirve para realizar los siguientes procesos:
     * Genera el producto "Cancion"
     * Calcular su costo
     **/
    public static class Cancion extends Producto {
        private int reproducciones;

        public Cancion(String nombre, double costoBase, String genero, boolean esEstreno, int reproducciones) {
            super(nombre, "Song", costoBase, genero, esEstreno);
            this.reproducciones = reproducciones;
        }
        @Override
        public double calcularCosto(){
            double costoTotal = costoBase + (esEstreno? 1.5 : 0.5) * reproducciones;
            return costoTotal;
        }
    }
    /**
     * Esta clase sirve para realizar los siguientes procesos:
     * Genera el producto "Libro"
     * Calcular su costo
     **/
    public static class Libro extends Producto{
        private int diasLectura;
        public Libro(String nombre, double costoBase, String genero, boolean esEstreno, int diasLectura){
            super(nombre, "Book", costoBase, genero, esEstreno);
            this.diasLectura = diasLectura;
        }
        @Override
        public  double calcularCosto(){
            double costoTotal = costoBase + diasLectura * (genero.equals("Novel") ? 2 : (genero.equals("Technology") ? 3 : 1));
            costoTotal += esEstreno ? 0.5 : 0;
            return costoTotal;
        }
        /**
         * Esta clase sirve para realizar los siguientes procesos:
         * Genera el producto "Pelicula"
         * Calcular su costo
         **/
        public static class Pelicula extends Producto{
            public Pelicula(String nombre, double costoBase, String genero, boolean esEstreno){
                super(nombre, "Movie", costoBase, genero, esEstreno);
            }
            @Override
            public double calcularCosto(){
                return costoBase + (esEstreno ? 15 : 7);
            }
            /**
             * Esta clase sirve para realizar los siguientes procesos:
             * Genera el producto "Videojuego"
             * Calcular su costo
             **/
            public static class Videojuego extends Producto{
                private int diasJugados;
                public Videojuego(String nombre, double costoBase, String genero, boolean esEstreno, int diasJugados){
                    super(nombre, "Videogame", costoBase, genero, esEstreno);
                    this.diasJugados = diasJugados;
                }
                @Override
                public double calcularCosto(){
                    return costoBase + diasJugados * 10;
                }
            }
        }
    }
    /**
     * Esta clase sirve para realizar los siguientes procesos:
     * Genera el consumo aleatorio
     **/
    public static List<Producto> ConsumoAleatorio(){
        List<Producto> productosConsumidos = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 5; i++){
            int opcion = random.nextInt(4);

            switch (opcion){
                case 0:
                    productosConsumidos.add(new Cancion("Song " + (i + 1), 5, "Pop", random.nextBoolean(), random.nextInt(10) + 1));
                    break;
                case 1:
                    productosConsumidos.add(new Libro("Book" + (i + 1), 5, "Novel", random.nextBoolean(), random.nextInt(10) + 1));
                    break;
                case 2:
                    productosConsumidos.add(new Libro.Pelicula("Movie" + (i + 1), 5, "Drama", random.nextBoolean()));
                    break;
                case 3:
                    productosConsumidos.add(new Libro.Pelicula.Videojuego("Videogame" + (i + 1), 5, "Action", random.nextBoolean(), random.nextInt(10) + 1));
                    break;
            }
        }
        return productosConsumidos;
    }
    /**
     * Esta clase sirve para realizar los siguientes procesos:
     * Calcular el costo total
     **/
    public static double calcularCostoTotal(List<Producto> productosConsumidos){
        double costoTotal = 0;
        for (Producto producto : productosConsumidos){
            costoTotal += producto.calcularCosto();
        }
        return costoTotal;
    }
}
