package ListYSet.Ej1211;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            int opcion;
            do {
                System.out.println("--------OPCIONES--------\n1. Alta\n2. Baja\n3. Modificación\n4. Listado por DNI\n5. Listado por antigüedad\n6. Salir");
                FileOutputStream fos = new FileOutputStream("Tema 7 (Colecciones)/Boletin/src/main/java/ListYSet/Ej1211/socios.dat");
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                Scanner sc = new Scanner(System.in);
                opcion = sc.nextInt();

                switch (opcion) {
                    case 1 -> System.out.println();
                    case 2 ->
                    case 3 ->
                    case 4 ->
                    case 5 ->
                    case 6 -> System.out.println("Adiós.");
                    default -> System.out.println("[ERROR] Opción no válida");
                }
            } while (opcion != 6);

        } catch (FileNotFoundException e) {
            System.out.println("[ERROR] Archivo no encontrado");
        } catch (IOException e) {
            System.out.println("[ERROR NO IDENTIFICADO]");
        }
    }
}
