package string_diapositivas;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String cadena1 = "";
        cadena1 = introducirString(cadena1, sc);
        String cadena2 = "";
        cadena2 = introducirString(cadena2, sc);

        if (comprobarDosCadenas(cadena1, cadena2)) {
            System.out.println(cadena1+" y "+cadena2+". Son iguales");
        } else {
            System.out.println(cadena1+" y "+cadena2+". Son diferentes");
        }
    }

    public static String introducirString(String a, Scanner sc)  {
        System.out.println("Dime una cadena:");
        a = sc.nextLine();
        return a;
    }

    public static boolean comprobarDosCadenas(String a, String b) {
        if (a.equals(b)) {
            return true;
        } else if (a.length() != b.length()) {
            return false;
        } else {
            int coincidencia = 0;
            for (int i = 0; i < a.length(); i++) {
                if (Character.toLowerCase(a.charAt(i)) == Character.toLowerCase(b.charAt(i))) {
                    coincidencia++;
                }
            }
            if (coincidencia == a.length()) {
                return true;
            } else {
                return false;
            }
        }
    }
}
