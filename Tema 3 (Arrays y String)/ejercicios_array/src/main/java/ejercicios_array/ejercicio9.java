package ejercicios_array;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime la nota de los 5 programadores:");

        int notas_participantes [] = new int[5];
        for (int i = 0; i < notas_participantes.length; i++) {
            System.out.println("Nota del participante:");
            notas_participantes [i] = sc.nextInt();
            while (notas_participantes[i] > 10 || notas_participantes[i] < 0) {
                System.out.println("Nota no válida, vuelva a introducirla: ");
                notas_participantes [i] = sc.nextInt();
            }
        }
        System.out.println("Notas de los primeros 5 participantes:");
        Arrays.sort(notas_participantes);
        System.out.println(Arrays.toString(notas_participantes));

        int nota;
         do {
            System.out.println("Nota programador de exhibición");
            nota = sc.nextInt();
            while ((nota < 0 || nota > 10) && nota != -1) {
                System.out.println("Nota no válida, vuelve a intentarlo");
                nota = sc.nextInt();
            }
            if (nota > -1) {
                notas_participantes = Arrays.copyOf(notas_participantes, notas_participantes.length+1);
                notas_participantes[notas_participantes.length-1] = nota;
            }
        } while (nota > -1);

        System.out.println("---PUNTUACIONES FINALES---");
        Arrays.sort(notas_participantes);
        System.out.println(Arrays.toString(notas_participantes));
    }


}
