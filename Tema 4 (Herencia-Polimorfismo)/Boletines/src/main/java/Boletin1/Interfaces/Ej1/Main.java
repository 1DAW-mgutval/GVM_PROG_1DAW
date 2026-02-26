package Boletin1.Interfaces.Ej1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Lista lista = new Lista();

        Integer num=0;
        while (num >= 0){
            System.out.println("Dime un número:");
            num = sc.nextInt();
            if (num>=0) lista.encolar(num);
        }

        System.out.println("\nFin del programa--\n-------------DESENCOLANDO----------------");

        for (int i = 0; i <= lista.numElementos(); i++) {
            System.out.println("Desencolado número: "+lista.desencolar());
        }
    }
}
