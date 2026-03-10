package ejemplo_entregable;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char dni_letras[] = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};

        System.out.println("Dime tu dni:");
        int dni = sc.nextInt();

        System.out.println("La letra de tu dni es: " + dni_letras[dni%23]);
    }
}
