package ejercicios_array;

import java.util.Arrays;

public class ejercicio7 {
    public static void main(String[] args) {
        int ejemplo [] = {1,2,3,4,5,6,7,8,9,1,1,1,2,2,2};

        System.out.println("antes: " + ejemplo.length);
        recorrer_array(ejemplo);

        ejemplo = quitar_repetido(ejemplo);

        System.out.println("Después: " + ejemplo.length);
        recorrer_array(ejemplo);
    }

    public static int [] quitar_repetido (int t[]) {
        int contador = 0, contador2 = 0;
        int array [] = new int[1];
        boolean primero = true;

        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t.length; j++) {
                if ( i != j && t[i] == t[j]) {
                    contador++;
                }
            }

            if (contador == 0 && !primero) {
                array = Arrays.copyOf(array, array.length+1);
                array[array.length-1] = t[i];
            } else if (contador == 0 && primero) {
                array[array.length-1] = t[i];
                primero = false;
            }

            for (int j = 0; j <= array.length-1; j++) {
                if (contador > 0 && array[j] == t[i]) {
                    contador2++;
                }
            }

            if (contador > 0 && contador2 == 0 && !primero) {
                array = Arrays.copyOf(array, array.length+1);
                array[array.length-1] = t[i];
            } else if (contador > 0 && contador2 == 0 && primero) {
                array[array.length-1] = t[i];
                primero = false;
            }
            contador2 = 0;
            contador = 0;
        }

        return array;
    }

    public static void recorrer_array (int a[]) {
        for (int i = a.length-1; i >= 0; i--) {
            System.out.println(a[i]);
        }
    }

}
