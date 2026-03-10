package ejercicios_array;

import java.util.Scanner;

public class ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Longitud de la combinación");
        int longitud;
        do {
            longitud = sc.nextInt();
            if (longitud < 1) {
                System.out.println("ERROR. Introuzca un valor válido");
            }
        } while (longitud < 1);

        int combinacion_secreta [] = new int[longitud];
        combinacionAleatoria(combinacion_secreta);

        System.out.println("Intenta Adivinarla:");

        int num;
        for (int i = 0; i != longitud; i++) {
            System.out.print("\n Número: ");
            num = sc.nextInt();
            while (num != combinacion_secreta[i]) {
                if (num > combinacion_secreta[i]) {
                    System.out.println(num+ " es más grande que el número "+(i+1)+" de la combinación.");
                } else {
                    System.out.println(num+ " es más pequeño que el número "+(i+1)+" de la combinación.");
                }
                System.out.print("\n Siguiente intento: ");
                num = sc.nextInt();
            }
            System.out.println("\n ACERTASTE ¡OLE OLE!");
        }
        System.out.println("\n ----ERES UN MÁQUINA, MASTODONTE, CRACK, INVENCIBLE---- \n");
    }

    public static void combinacionAleatoria (int t[]) {
        for (int i = 0; i < t.length; i++) {
            t[i] = (int)(Math.random()*5)+1;
        }
    }
}
