import java.util.Scanner;

public class ej1_mario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, doble, triple;

        System.out.println("Escribe un número entero:");
        numero = sc.nextInt();

        doble = numero * 2;
        triple = numero * 3;

        System.out.println("El doble de "+ numero +" es "+ doble);
        System.out.println("El triple de "+ numero +" es "+ triple);
    }
}