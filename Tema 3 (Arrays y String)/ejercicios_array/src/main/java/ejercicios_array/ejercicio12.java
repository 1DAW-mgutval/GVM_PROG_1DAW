package ejercicios_array;

import java.util.Arrays;

public class ejercicio12 {
    public static void main(String[] args) {
        int tabla[][] = new int[5][5];

        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                tabla[i][j] = 10*i+j;
            }
        }

        mostrarFilasArray(tabla);
    }

    public static void mostrarFilasArray (int t[][]) {
        for (int i = 0; i < t.length; i++) {
            System.out.println(Arrays.toString(t[i]));
        }
    }
}
