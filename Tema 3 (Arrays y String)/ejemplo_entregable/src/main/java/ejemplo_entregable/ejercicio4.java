package ejemplo_entregable;

import java.util.Arrays;

public class ejercicio4 {
    public static void main(String[] args) {
        int ejemplo[] = {1,2,66,68,};
        int devuelto[] = filtraCon7(ejemplo);
        System.out.println(Arrays.toString(ejemplo));
        System.out.println(Arrays.toString(devuelto));
    }

    public static int[] filtraCon7(int x[]) {
        int resultado[] = {-1};
        int indice_resultado = 0;
        String num_actual;
        boolean encontrado = false, primero = true;
        for (int i = 0; i < x.length; i++) {
            num_actual = String.valueOf(x[i]);
            for (int j = 0; j < num_actual.length() && !encontrado; j++) {
                if (num_actual.charAt(j) == '7') {
                    if (primero) {
                        resultado[indice_resultado] = x[i];
                        indice_resultado++;
                        primero = false;
                    } else {
                        resultado = Arrays.copyOf(resultado, indice_resultado+1);
                        resultado[indice_resultado] = x[i];
                        indice_resultado++;
                    }
                    encontrado = true;
                }
            }
            encontrado = false;
        }

        return resultado;
    }
// Devuelve un array con todos los números
// que contienen el 7 (por ej. 7, 27, 782)
// que se encuentren en otro array que se
// pasa como parámetro. El tamaño del array
// que se devuelve será menor o igual al
// que se pasa como parámetro.
}
