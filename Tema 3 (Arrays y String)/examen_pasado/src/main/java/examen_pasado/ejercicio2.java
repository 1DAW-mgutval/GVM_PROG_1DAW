package examen_pasado;

public class ejercicio2 {
    public static void main(String[] args) {
        int matriz1[][] = {{2,3,1},{2,4,0}};
        int matriz2[][] = {{1,1},{0,0},{2,0}};

        int resultado[][] = multiplicarMatrices(matriz1, matriz2);
        imprimirMatriz(resultado);
    }

    public static void imprimirMatriz (int[][] matriz) {
        for (int i = 0; i < matriz[i].length; i++) {
            System.out.print("Fila nº "+(i+1));
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }
    }

    public static int[][] multiplicarMatrices(int[][] matriz1, int[][] matriz2) {
        int resultado[][] = new int[matriz1.length][matriz2[0].length];
        if (matrizMultiplicable(matriz1, matriz2)) {
            for (int i = 0; i < resultado[i].length; i++) {
                for (int j = 0; j < resultado.length; j++) {
                    resultado[i][j] = matriz1[i][j] * matriz2[j][i];
                }
            }
        }
        return resultado;
    }

    public static boolean matrizMultiplicable (int[][] matriz1, int[][] matriz2) {
        boolean resultado = false;
        for (int i = 0; i < matriz1[i].length; i++) {
                if (matriz1[i].length == matriz2.length) {
                    resultado = true;
                }
        }
        return resultado;
    }
}
