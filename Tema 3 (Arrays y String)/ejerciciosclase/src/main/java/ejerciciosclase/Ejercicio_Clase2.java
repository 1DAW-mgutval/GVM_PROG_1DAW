package ejerciciosclase;
import java.util.Scanner;

public class Ejercicio_Clase2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nombre = "";
        double nota;
        String informe = "";
        for (int i = 1; i <= 10; i++) {
            System.out.println("Dime el nombre del alumno:");
            nombre = sc.next();
            System.out.println("Dime la nota del alumno:");
            nota = sc.nextDouble();

            informe = informe + "El alumno "+nombre+" | Tiene una nota inicial de "+nota+" | Después de la revisión es " + revision(nota) + " | Su nota para la selectividad es " + selectividad(revision(nota)) + "\n";
        }
        System.out.println(informe);
    }

    public static double selectividad(double x) {
        return x * 1.4;
    }

    public static double revision(double x) {
        if (x >= 4 && x < 5) {
            return x+1;
        } else {
            return x;
        }
    }
}
