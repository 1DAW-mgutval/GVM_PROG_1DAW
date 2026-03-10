package practicaentregable3;
import java.util.Scanner;
public class EJ4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime la altura:");
        int altura;
        do {
            altura =  sc.nextInt();
            if (altura < 3 || altura % 2 == 0) {
                System.out.println("Altura no válida. Inténtalo de nuevo:");
            }
        } while (altura < 3 || altura % 2 == 0);

        for (int i = 0; i < altura/2; i++) {
            for (int j = 0; j <= altura/2+6; j++) {
                if (i+j==altura/2 || i+j==altura/2+6) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for (int i = altura/2; i >= 0; i--) {
            for (int j = 0; j <= altura/2+6; j++) {
                if (i+j==altura/2 || i+j==altura/2+6) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
