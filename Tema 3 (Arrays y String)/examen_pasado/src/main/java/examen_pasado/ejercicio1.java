package examen_pasado;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tamaño de la lista:");
        int size = sc.nextInt();
        int lista[] = new int[size];

        for (int i = 0; i < lista.length; i++) {
            lista[i] = (int)(Math.random() * 99);
        }

        int ordenados[] = paresImpares(lista);
        System.out.println(Arrays.toString(lista));
        System.out.println(Arrays.toString(ordenados));
    }

    // Si devuelve -1 es que no hay ningún par.
    public static int[] agruparPares (int lista[]) {
        int pares[] = {-1};
        int indicePares = 0;
        boolean primero = true;
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] % 2 == 0) {
                if (primero) {
                    pares[indicePares] = lista[i];
                    indicePares++;
                    primero = false;
                } else {
                    pares = Arrays.copyOf(pares, indicePares+1);
                    pares[indicePares] = lista[i];
                    indicePares++;
                }
            }
        }
        return pares;
    }

    // Si devuelve -1 es que no hay ningún impar.
    public static int[] agruparImpares (int lista[]) {
        int impares[] = {-1};
        int indicePares = 0;
        boolean primero = true;
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] % 2 == 1) {
                if (primero) {
                    impares[indicePares] = lista[i];
                    indicePares++;
                    primero = false;
                } else {
                    impares = Arrays.copyOf(impares, indicePares+1);
                    impares[indicePares] = lista[i];
                    indicePares++;
                }
            }
        }
        return impares;
    }

    public static int[] paresImpares (int lista[]) {
        int pares[] = agruparPares(lista);
        int impares[] = agruparImpares(lista);
        
        int resultado[] = {-1};
        int indiceResultado = 0;
        boolean primero = true;
        for (int i = 0; i < pares.length && pares[0] != -1; i++) {
            if (primero) {
                resultado[indiceResultado] = pares[i];
                indiceResultado++;
                primero = false;
            } else {
                resultado = Arrays.copyOf(resultado, indiceResultado+1);
                resultado[indiceResultado] = pares[i];
                indiceResultado++;
            }
        }

        for (int i = 0; i < impares.length && impares[0] != -1; i++) {
            if (primero) {
                resultado[indiceResultado] = impares[i];
                indiceResultado++;
                primero = false;
            } else {
                resultado = Arrays.copyOf(resultado, indiceResultado+1);
                resultado[indiceResultado] = impares[i];
                indiceResultado++;
            }
        }
        return resultado;
    }
}
