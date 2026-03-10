package string_diapositivas;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String password = "", guess = "";
        System.out.println("JUEGADOR1");
        password = introducirString(password, sc);

        System.out.println("JUGADOR2 \nModo de juego: \n1 - Con pista\n2 - Sin pista");
        int modo = sc.nextInt();
        while (modo != 1 || modo != 2) {
            System.out.println("ERROR. Introduce un modo de juego válido. \n1 - Con pista\n2 - Sin pista");
            modo = sc.nextInt();
        }
        juego(guess, password, modo, sc);
    }

    public static String introducirString(String a, Scanner sc)  {
        System.out.println("Dime una cadena:");
        a = sc.nextLine();
        return a;
    }

    public static void juego(String a, String b, int modo, Scanner sc) {
        if (modo == 1) {
            while (!a.equals(b)) {
                System.out.println("Haz tu intento:");
                a = sc.nextLine();
                if (a.charAt(0) > b.charAt(0)) {
                    System.out.println("INCORRECTO \nLa respuesta es mayor alfabéticamente que la contraseña.");
                } else {
                    System.out.println("INCORRECTO \nLa respuesta es mayor alfabéticamente que la contraseña.");
                }
            }
            System.out.println("CORRECTO. Eres un auténtico adivino.");
        } else {
            while (!a.equals(b)) {
                System.out.println("Longitud de la contraseña: "+b.length());
                System.out.println("Haz tu intento:");
                a = sc.nextLine();
                
                if (!a.equals(b)) {
                    String pista = "";
                    for(int i = 0; i < b.length(); i++) {
                        if (b.charAt(i) == a.charAt(i)) {
                            pista += b.charAt(i);
                        }
                    }
                }

            }
            System.out.println("CORRECTO. Eres un auténtico adivino.");
        }
    }
}
