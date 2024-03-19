package edu.hernan_hernandez.reto5;

public class Reto5_2 {
    import java.util.ArrayList;
    import java.util.List;

    public class Cliente {
        private String nombre;
        private int ID;
        private String direccion;
        private List<CuentaBancaria> listaCuentasBancarias;

        public Cliente(String nombre, int ID, String direccion) {
            this.nombre = nombre;
            this.ID = ID;
            this.direccion = direccion;
            this.listaCuentasBancarias = new ArrayList<>();
        }

        public void agregarCuenta(CuentaBancaria cuenta) {
            listaCuentasBancarias.add(cuenta);
        }

        public void eliminarCuenta(CuentaBancaria cuenta) {
            listaCuentasBancarias.remove(cuenta);
        }
    }

    public class CuentaBancaria {
        private String tipoCuenta;
        private double saldo;
        private List<Transaccion> historialTransacciones;

        public CuentaBancaria(String tipoCuenta, double saldo) {
            this.tipoCuenta = tipoCuenta;
            this.saldo = saldo;
            this.historialTransacciones = new ArrayList<>();
        }

        public void depositar(double cantidad) {
            saldo += cantidad;
            //Transacción en el historial
        }

        public void retirar(double cantidad) {
            saldo -= cantidad;
            //Transacción en el historial
        }

        public void transferir(double cantidad, CuentaBancaria cuentaDestino) {
            saldo -= cantidad;
            cuentaDestino.depositar(cantidad);
            //Transacción en el historial
        }
    }

    public class Transaccion {
        //Transacción bancaria
    }
}
