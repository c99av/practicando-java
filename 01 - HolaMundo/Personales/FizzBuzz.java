package Personales;

    import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        // crear el scanner
        Scanner scanner = new Scanner(System.in);

        //número entre 1 y 100
        System.out.print("Ingresa un numero entre 1 y 100: ");
        int numero = scanner.nextInt();

        //divisible por 3 y 5
        if (numero % 3 == 0 && numero % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (numero % 3 == 0) {
            System.out.println("Fizz");
        } else if (numero % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(numero);
        }

        // cerrar el scanner
        scanner.close();
    }
}
