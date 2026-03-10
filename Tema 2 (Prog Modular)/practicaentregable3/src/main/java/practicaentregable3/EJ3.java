package practicaentregable3;
import java.util.Scanner;

public class EJ3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime un número entero positivo:");
        long num;
        do {
            num = sc.nextLong();
            if (num < 0) {
                System.out.println("ERROR. Número equivocado.");
            }
        } while (num < 0);

        long num_final = 0;
        long cifra;
        long multiplicador = 1;
        while (num > 0) {
            cifra = num % 2;
            num_final = num_final + cifra * multiplicador;
            num /= 2;
            multiplicador *= 10;
        }

        System.out.println("Número final: "+num_final);
    }
}
