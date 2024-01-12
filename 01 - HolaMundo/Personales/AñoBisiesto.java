package Personales;

import java.util.Scanner;

public class AñoBisiesto {
    public static void main(String[] args) {
        // Crear el Scanner
        Scanner scanner = new Scanner(System.in);

        // Pedir que ingreses un año
        System.out.print("Ingrese un año: ");
        int anio = scanner.nextInt();

        // comprobar si el año es bisiesto
        boolean esBisiesto = false;

        if (anio % 4 == 0) {
            if (anio % 100 != 0 || (anio % 100 == 0 && anio % 400 == 0)) {
                esBisiesto = true;
            }
        }

        // Mostrar el resultado
        if (esBisiesto) {
            System.out.println(anio + " es un año bisiesto.");
        } else {
            System.out.println(anio + " no es un año bisiesto.");
        }

        // Cerrar el Scanner
        scanner.close();
    }
}
