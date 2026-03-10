import java.util.Scanner;

public class ej2_mario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float numero;

        System.out.println("Escribe un número real: ");
        numero = sc.nextFloat();

        numero = numero * numero;

        System.out.println("Tu número al cuadrado es igual a: "+ numero);
    }
}