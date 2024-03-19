package edu.hernan_hernandez.reto8.ui;

public class Textos {
    public String OPERACION;
    public String SUMA;
    public String RESTA;
    public String MULTIPLICACION;
    public String DIVISION;
    public String MODULO;
    public String POTENCIA;
    public String RAIZ;
    public String LOGARITMO;
    public String NOVALIDA;
    public String BYE;
    public String NODIVIDIRCERO;
    public String NOMODULOCERO;
    public String NORAIZCERO;
    public String NOLOGARITMOCERO;

    public Textos(){
        OPERACION = "Select the operation to perform:\n" +
                "1. Sum\n" +
                "2. Subtraction\n" +
                "3. Multiplication\n" +
                "4. Division\n" +
                "5. Module\n" +
                "6. Power\n" +
                "7. Square root (about the first number)\n" +
                "8. Natural logarithm (base e) (over the first number)\n" +
                "9. Exit";
        SUMA = "The sum is: ";
        RESTA = "The subtraction is: ";
        MULTIPLICACION = "Multiplication is: ";
        DIVISION = "The division is: ";
        MODULO = "The module is: ";
        POTENCIA = "The power is: ";
        RAIZ = "The square root is: ";
        LOGARITMO = "The natural logarithm is: ";
        NOVALIDA = "Invalid option.";
        BYE = "Goodbye";
        NODIVIDIRCERO = "You can't divide by zero.";
        NOMODULOCERO = "You cannot calculate the module with zero.";
        NORAIZCERO = "You cannot calculate the square root of a negative number.";
        NOLOGARITMOCERO = "You cannot calculate the logarithm of zero or negative numbers.";
    }
}
