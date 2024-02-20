package edu.hernan_hernandez.reto4boletosdebus.ui;

import edu.hernan_hernandez.reto4boletosdebus.process.Almacenamiento;

import java.util.Scanner;

public class CLIB {
    public static void main(){
        Scanner scanner = new Scanner(System.in);
        char opcion;

        //Bucle do-while para las opciones del menu
        do{
            //Se manda a llamar al menu
            MostrarMenu();
            opcion = scanner.next().charAt(0);
            switch (opcion){
                case 'A':
                    Almacenamiento.ventadeBoletos();
                    break;
                case 'B':
                    Almacenamiento.listadeVentas();
                    break;
                case 'S':
                    System.out.println("Fin del programa");
                    break;
            }
        }while (opcion != 'S');
    }

    //Aqui es donde empieza el programa
    public static void MostrarMenu(){
        System.out.println("---Sistema de registro de ventas---");
        System.out.println("A. Realizar venta de boleto");
        System.out.println("B. Mostrar datos de la lista de ventas");
        System.out.println("S. Finalizar programa");
    }
}
