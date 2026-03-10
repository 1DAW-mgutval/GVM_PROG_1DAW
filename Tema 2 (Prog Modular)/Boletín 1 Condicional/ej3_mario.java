import java.util.Scanner;

public class ej3_mario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre, apellido1, apellido2;

        System.out.println("Escribe tu nombre:");
        nombre = sc.nextLine();

        System.out.println("Escribe tu primer apellido:");
        apellido1 = sc.nextLine();

        System.out.println("Escribe tu segundo apellido:");
        apellido2 = sc.nextLine();

        System.out.println("Tu nombre y apellidos son: "+ nombre + " " + apellido1 + " " + apellido2);
    }
}