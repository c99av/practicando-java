package Personales;

import java.util.Scanner;

public class FizzBuzzSwitch {
     public static void main(String[] args) {
        // Crear el Scanner
        Scanner scanner = new Scanner(System.in);

        // Ingresa un número entre 1 y 100
        System.out.print("Ingrese un número entre 1 y 100: ");
        int numero = scanner.nextInt();

        // Calcular el residuo de la división por 3 y 5
        int residuo3 = numero % 3;
        int residuo5 = numero % 5;

        // Utiliza bucle switch
        switch (residuo3) {
            case 0:
                System.out.print("Fizz");
                break;
            default:
                break;
        }

        switch (residuo5) {
            case 0:
                System.out.print("Buzz");
                break;
            default:
                break;
        }

        // Si no es divisible por 3 ni por 5,mostrar el número
        if (residuo3 != 0 && residuo5 != 0) {
            System.out.print(numero);
        }

        // Cerrar el Scanner
        scanner.close();
    }
}
