package ejercicios_array;

import java.util.Scanner;

public class ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int grupo [][] = new int[5][3];

        preguntarNotas(grupo, sc);
        mostrarNotas(grupo);
        System.out.println("");
        int media[] = new int[5];
        mostrarMediaTrimestreAlumno(media, grupo, sc);
    }

    public static void preguntarNotas (int grupo[][], Scanner sc) {
        for (int i = 0; i < grupo.length; i++) {
            for (int j = 0; j < grupo[i].length; j++) {
                System.out.println("Nota del trimestre " + (j+1) + ". Del alumno " + (i+1) +".");
                grupo[i][j] = sc.nextInt();
                while (grupo[i][j] > 10 || grupo[i][j] < 0) {
                    System.out.println("ERROR. Nota incorrecta. \n Vuelve a introducir la nota: ");
                    grupo[i][j] = sc.nextInt();
                }
            }
        }
    }

    public static void mostrarNotas (int t [][]) {
        for (int i = 0; i < t.length; i++) {
            System.out.println("Nota del alumno "+(i+1));
            for (int j = 0; j < t[i].length; j++) {
                System.out.print("Trimestre " + (j+1)+" nota: "+t[i][j] + " | ");
            }
            System.out.println("");
        }
    }

    public static void mostrarMediaTrimestreAlumno (int t[],int a[][], Scanner sc) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[j].length; j++) {
                t[i] += a[i][j];
            }
            t[i] /= a[i].length; 
        }

        int seguir, alumno;
        do {
            System.out.println("¿Desea mostrar la media de un alumno? (si - 1 | no - 0)");
            seguir = sc.nextInt();
            if (seguir != 1 && seguir != 0) {
                System.out.println("Respuesta no válida, introduce otro número. \n ¿Desea mostrar la media de un alumno? (si - 1 | no - 0)");
                seguir = sc.nextInt();
            }
            if (seguir == 1) {
                System.out.println("¿De qué alumno?");
                alumno = sc.nextInt();
                if (alumno <= t.length && alumno > 0) {
                    System.out.println("Su media es: "+t[alumno-1]);
                } else {
                    System.out.println("Alumno INCORRECTO.");
                }
            }
        } while (seguir == 1);
    }
}
