package Personales;

import java.util.Scanner;

public class VelocidadUsuario {
    public static void main(String[] args) {
        //Escribir en el terminal
        Scanner scanner = new Scanner(System.in);
        //Ingresar la velocidad en el terminal
        System.out.print("Ingrese la velocidad: ");
        int velocidad = scanner.nextInt();
        //velocidad superior a 120
        if (velocidad > 120) {
        //Velocidad superior a 120   
            System.out.println("Multa por velocidad!");
        } else {
        //Velocidad no es mayor que 120   
            System.out.println("Velocidad permitida. No hay multa.");
        }

        
        scanner.close();
    }
}
