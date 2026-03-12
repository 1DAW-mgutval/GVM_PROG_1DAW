package Ejercicios.Ej101;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(leerEntero());
    }

    public static Integer leerEntero() {
        Scanner sc = new Scanner(System.in);

        Integer res = null;
        boolean seguir = true;
        while (seguir) {
            try {
                System.out.println("Dime un número entero:");
                res = sc.nextInt();
                seguir = false;
            } catch (RuntimeException ex) {
                System.out.println("[ERROR] Número equivocado, vuelve a intentarlo.\n");
                sc.nextLine();
            }
        }
        return res;
    }
}
