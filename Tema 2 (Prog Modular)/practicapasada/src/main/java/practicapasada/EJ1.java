package practicapasada;
import java.util.Scanner;
public class EJ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, introduzca un número:");
        long num1 = sc.nextInt();

        System.out.println("Por favor, introduzca otro número:");
        long num2 = sc.nextInt();

        long par_final = 0;
        long impar_final = 0, resto, cifra;

        int cifras_num1 = 0;
        long division1 = num1;
        int cifras_num2 = 0;
        long division2 = num2;

        while (division1 > 10) {
            cifras_num1++;
            division1 /= 10;
        }

        while (division2 > 10) {
            cifras_num2++;
            division2 /= 10;
        }

        long cifra_actual1 = (long)Math.pow(10, cifras_num1);
        long cifra_actual2 = (long)Math.pow(10, cifras_num2);
        while (num1 > 0 && num2 > 0) {
            resto = num1 % cifra_actual1;
            cifra = (num1 - resto)/cifra_actual1;
            if (cifra % 2 == 0) {
                par_final = (par_final * 10) + cifra;
            } else if (cifra % 2 == 1) {
                impar_final = (impar_final * 10) + cifra;
            }
            num1 = resto;
            cifra_actual1 /= 10;

            resto = num2 % cifra_actual2;
            cifra = (num2 - resto)/cifra_actual2;
            if (cifra % 2 == 0) {
                par_final = (par_final * 10) + cifra;
            } else if (cifra % 2 == 1) {
                impar_final = (impar_final * 10) + cifra;
            }
            num2 = resto;
            cifra_actual2 /= 10;

        }
        System.out.println("El número formado por los dígitos pares es " + par_final);
        System.out.println("El número formado por los dígitos impares es " + impar_final);
    }
}
