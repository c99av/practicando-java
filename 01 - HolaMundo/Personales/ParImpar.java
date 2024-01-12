package Personales;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        // crear scanner
        Scanner scanner = new Scanner(System.in);

        // introducir un numero entero
        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();

        // comprabar si es par o impar
        if (numero % 2 == 0) {
            System.out.println("El número ingresado es par.");
        } else {
            System.out.println("El número ingresado es impar.");
        }

        // cerrar Scanner
        scanner.close();
    }
}
