package ejercicios_array;

public class funcionordenar {
    public static void main(String[] args) {
        
    }


    public static int[] ordenar_array (int a[]) {
        int menor = Integer.MAX_VALUE;
        int resultado [] = new int[a.length];
        int posicion = 0, contador = 0, contar_menor = 0;
        boolean menor_encontrado = false;

        while (posicion < a.length) {
            for (int i = 0; i < a.length && posicion == 0; i++) {
                if (a[i] < menor) {
                    menor = a[i];
                }
            }

            for (int i = 0; i < a.length && posicion != 0 && !menor_encontrado; i++) {
                for (int j = 0; j < a.length; j++) {
                    if (a[i] > menor && a[i] < a[j] && i != j) {
                        contar_menor++;
                    }
                    if (contar_menor == a.length-posicion ) {
                        menor = a[i];
                        menor_encontrado = true;
                    }
                }
                contar_menor = 0;
            }

            for (int i = 0; i < a.length; i++) {
                if (a[i] == menor) {
                    contador++;
                }
            }

            for (int i = 0; i < contador; i++) {
                resultado[posicion] = menor;
                posicion++;
            }
            contador = 0;
            menor_encontrado = false;
        }

        return resultado;
    }
}