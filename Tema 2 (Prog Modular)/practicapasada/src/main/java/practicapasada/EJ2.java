package practicapasada;
import java.util.Scanner;

public class EJ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, introduzca un número entero positivo:");
        long num = sc.nextInt();

        int contador_cifras = 0;
        long total_cifras = num;
        while (total_cifras > 10) {
            contador_cifras++;
            total_cifras /= 10;
        }

        long cifra;
        long resto;
        total_cifras = (long)Math.pow(10, contador_cifras);
        String digitos_pares="";
        String digitos_impares="";
        long suma_pares = 0, suma_impares = 0;

        while (num > 0) {
            resto = num % total_cifras;
            cifra = (num - resto) / total_cifras;

            if(cifra % 2 == 0) {
                digitos_pares = (digitos_pares+cifra+" ");
                suma_pares += cifra;
            } else {
                digitos_impares = (digitos_impares+cifra+" ");
                suma_impares += cifra;
            }
            num = resto;
            total_cifras /= 10;
        }
        System.out.println("Dígitos pares: "+digitos_pares);
        System.out.println("Dígitos impares: "+digitos_impares);
        System.out.println("Suma de los pares: "+suma_pares);
        System.out.println("Suma de los impares: "+suma_impares);

    }
}
