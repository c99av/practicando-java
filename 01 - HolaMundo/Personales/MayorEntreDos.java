
package Personales;

import java.util.Scanner;

public class MayorEntreDos {


public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        //ingresar dos enteros
        System.out.print("Ingrese el primer entero: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingrese el segundo entero: ");
        int numero2 = scanner.nextInt();

        //cuál es el mayor
        if (numero1 > numero2) {
            System.out.println("El mayor número es: " + numero1);
        } else if (numero2 > numero1) {
            System.out.println("El mayor número es: " + numero2);
        } else {
            System.out.println("Los dos números son iguales.");
        }

        // Cerrar scanner
        scanner.close();
    }
}