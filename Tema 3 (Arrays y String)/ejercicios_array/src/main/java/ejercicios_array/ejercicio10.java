package ejercicios_array;

import java.util.Arrays;

public class ejercicio10 {
    public static void main(String[] args) {
        int ejemplo [] = {1,4,6,7,4,3,2,6,7,9,5};

        int eliminados [] = eliminarMayores(ejemplo, 6);
        System.out.println(Arrays.toString(eliminados));

    }

    public static int [] eliminarMayores (int t[], int valor) {
        int resultado [] = new int[1];
        for (int i = 0; i < t.length; i++) {
            if (t[i] <= valor && i != 0) {
                resultado = Arrays.copyOf(resultado, resultado.length+1);
                resultado [resultado.length-1] = t[i];
            } else if (t[i] <= valor) {
                resultado [resultado.length-1] = t[i];
            }
        }
        return resultado;
    }
}
