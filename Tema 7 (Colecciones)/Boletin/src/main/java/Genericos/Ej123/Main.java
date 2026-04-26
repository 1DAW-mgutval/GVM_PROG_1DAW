package Genericos.Ej123;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Contenedor<Integer> contenedor = new Contenedor<>();

        int num;
        do {
            System.out.println("Número:");
            num = sc.nextInt();
            if (num != -1) contenedor.apilar(num);
        } while (num != -1);

        while (contenedor.size() != 0) {
            System.out.println(contenedor.desapilar());
            System.out.println(contenedor.toString()+"\n");
        }
    }
}
