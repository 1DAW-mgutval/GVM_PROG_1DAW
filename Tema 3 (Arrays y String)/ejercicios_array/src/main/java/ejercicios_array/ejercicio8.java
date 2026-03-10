package ejercicios_array;

import java.util.Arrays;

public class ejercicio8 {
    public static void main(String[] args) {
        int ejemplo[] = {9,2,3,7,5,6,4};
        int par_ordenado [] = array_par_ordenado(ejemplo);
        System.out.println(Arrays.toString(par_ordenado));
        int impar_ordenado [] = array_impar_ordenado(ejemplo);
        System.out.println(Arrays.toString(impar_ordenado));
    }

    public static int [] array_par_ordenado ( int a[]) {
        int contador_pares = 0;
        boolean primero = true;
        int resultado [] = new int[1];
        for (int i = 0; i < a.length; i++) {
            if (primero) {
                for (int j : a) {
                    if (j % 2 == 0) {
                        contador_pares++;
                    }
                }
                resultado = Arrays.copyOf(resultado, contador_pares);
                primero = false;
            }
            if (a[i] % 2 == 0) {
                resultado[contador_pares-1] = a[i];
                contador_pares--;
            }
        }
        Arrays.sort(resultado);
        return resultado;
    }

    public static int [] array_impar_ordenado ( int a[]) {
        int contador_impares = 0;
        boolean primero = true;
        int resultado [] = new int[1];
        for (int i = 0; i < a.length; i++) {
            if (primero) {
                for (int j : a) {
                    if (j % 2 == 1) {
                        contador_impares++;
                    }
                }
                resultado = Arrays.copyOf(resultado, contador_impares);
                primero = false;
            }
            if (a[i] % 2 == 1) {
                resultado[contador_impares-1] = a[i];
                contador_impares--;
            }
        }
        Arrays.sort(resultado);
        return resultado;
    }
}