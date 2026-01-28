package ParteB;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Número de contraseñas:");
        int cantContrasenas = sc.nextInt();

        Password[] listaContrasenas = new Password[cantContrasenas];
        int[] listaLongitud = new int[cantContrasenas];

        for (int i = 0; i < listaLongitud.length; i++) {
            System.out.println("Longitud de la contraseña nº "+(i+1));
            listaLongitud[i] = sc.nextInt();
            if (listaLongitud[i] < 0) {
                listaLongitud[i] = 0;
            }
        }

        for (int i = 0; i < listaContrasenas.length; i++) {
            listaContrasenas[i] = new Password();
            listaContrasenas[i].setLongitud(listaLongitud[i]);
            System.out.println("Dime la contraseña:");
            listaContrasenas[i].setContrasena(sc.next());
        }

        String fuerte;
        for (Password contrasenaActual : listaContrasenas) {
            if (contrasenaActual.esFuerte()) {
                fuerte = "fuerte";
            } else {
                fuerte = "débil";
            }
            System.out.println(contrasenaActual.getContrasena() + ": " + fuerte);
        }
    }
}
