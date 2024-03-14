package edu.hernan_hernandez.reto5;

public class Reto5_5 {
    import java.util.ArrayList;
import java.util.List;

    public class CarritoCompras {
        private List<ArticuloSupermercado> listaArticulosSeleccionados;
        private List<Double> preciosUnitarios;
        private List<Integer> cantidades;
        private double IVA;
        private List<Double> importeNetoPorArticulo;

        public CarritoCompras() {
            listaArticulosSeleccionados = new ArrayList<>();
            preciosUnitarios = new ArrayList<>();
            cantidades = new ArrayList<>();
            importeNetoPorArticulo = new ArrayList<>();
        }

        public void agregarArticulo(ArticuloSupermercado articulo, double precioUnitario, int cantidad) {
            listaArticulosSeleccionados.add(articulo);
            preciosUnitarios.add(precioUnitario);
            cantidades.add(cantidad);
            importeNetoPorArticulo.add(precioUnitario * cantidad);
        }

        public void eliminarArticulo(ArticuloSupermercado articulo) {
            int index = listaArticulosSeleccionados.indexOf(articulo);
            if (index != -1) {
                listaArticulosSeleccionados.remove(index);
                preciosUnitarios.remove(index);
                cantidades.remove(index);
                importeNetoPorArticulo.remove(index);
            }
        }

        public double calcularTotal() {
            double total = 0.0;
            for (double importe : importeNetoPorArticulo) {
                total += importe;
            }
            total += total * IVA; //IVA al total
            return total;
        }
    }
}
