package ejemplo_entregable;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeros[][] = new int[4][5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Fila número " +(i+1));
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.println("Número "+(j+1));
                numeros[i][j] = sc.nextInt();
            }
        }

        int sumas[][] = new int[5][2];
        // Rellenar filas
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                    sumas[i][0] += numeros[i][j];
            }
        }
        // Rellenar columnas
        for (int i = 0; i < numeros[0].length; i++) {
            for (int j = 0; j < numeros.length; j++) {
                    sumas[i][1] += numeros[j][i];
            }
        }

        for (int i = 0; i < sumas.length; i++) {
            System.out.println("Iteración: "+(i+1));
            for (int j = 0; j < sumas[j].length; j++) {
                if (j == 0) {
                    System.out.println("Suma filas: "+sumas[i][j]);
                } else {
                    System.out.println("Columnas: "+sumas[i][j]);
                }
            }
        }
    }
}
