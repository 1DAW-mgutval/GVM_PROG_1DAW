package Ej2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PruebasExcepciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1 = 0, num2 = 0;
        boolean seguir = true;
        while (seguir) {
            try {
                System.out.println("Introduce los números:");
                num1 = sc.nextInt();
                num2 = sc.nextInt();
                seguir = false;
            } catch (InputMismatchException e) {
                System.out.println("[ERROR] Número introducido no correcto, vuelva a intentarlo.");
                sc.next();
            }
        }

        System.out.println("Media: "+((num1+num2)/2));
    }
}
