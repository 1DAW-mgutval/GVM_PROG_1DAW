package boletin1;
import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime dos números:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        numerosComprendidos(num1, num2);
    }

    public static void numerosComprendidos (int a, int b) {
        for (int i = a; i <= b; i++) {
            System.out.println(i);
        }
    }
}
