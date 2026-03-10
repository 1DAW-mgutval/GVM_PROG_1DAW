package ejercicios_array;
import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime 5 números decimales:");
        double numeros[] = new double[5];

        for (int i = 0; i < 5; i++) {
            numeros[i] = sc.nextDouble();
        }

        recorrer_array(numeros);

    }

    public static void recorrer_array (double a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
