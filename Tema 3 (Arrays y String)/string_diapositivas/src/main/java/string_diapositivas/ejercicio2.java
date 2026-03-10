package string_diapositivas;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String cad1 = "", cad2 = "";
        cad2 = introducirString(cad2, sc);
        cad1 = introducirString(cad1, sc);

        cadenaMenor(cad1, cad2);
    }

    public static String introducirString(String a, Scanner sc)  {
        System.out.println("Dime una cadena:");
        a = sc.nextLine();
        return a;
    }

    public static void cadenaMenor(String a, String b) {
        if (a.length() > b.length()) {
            System.out.println(b + " es la cadena más corta");
        } else if (b.length() > a.length()) {
            System.out.println(a+" es la cadena más corta");
        } else {
            System.out.println("Las cadenas tienen la misma longitud");
        }
    }
}
