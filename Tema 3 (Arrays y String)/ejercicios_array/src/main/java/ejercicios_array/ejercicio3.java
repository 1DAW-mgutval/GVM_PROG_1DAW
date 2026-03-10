package ejercicios_array;
import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Números que desea introducir:");
        int total = sc.nextInt();

        System.out.println("Dime " + total + " números enteros:");
        int numeros[] = new int[total];

        for (int i = 0; i < total; i++) {
            numeros[i] = sc.nextInt();
        }

        System.out.println("Orden inverso:");
        recorrer_array(numeros);

    }

    public static void recorrer_array (int a[]) {
        for (int i = a.length-1; i >= 0; i--) {
            System.out.println(a[i]);
        }
    }
}
