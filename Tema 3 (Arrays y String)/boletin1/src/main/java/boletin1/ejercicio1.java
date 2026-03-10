package boletin1;
import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Número de veces:");
        int num = sc.nextInt();

        eco(num);
    }

    public static void eco (int num) {
        for (int i = 0; i < num; i++) {
            System.out.println("Eco");
        }
    }

}
