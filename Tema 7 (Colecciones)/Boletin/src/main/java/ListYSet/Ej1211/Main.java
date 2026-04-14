package ListYSet.Ej1211;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            int opcion;
            do {
                FileOutputStream fos = new FileOutputStream("Tema 7 (Colecciones)/Boletin/src/main/java/ListYSet/Ej1211/socios.dat");
                ObjectOutputStream oos = new ObjectOutputStream(fos);

                Scanner sc = new Scanner(System.in);
                System.out.println("--------OPCIONES--------\n1. Alta\n2. Baja\n3. Modificación\n4. Listado por DNI\n5. Listado por antigüedad\n6. Salir");
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
            System.out.println("[ERROR] No hay ningún socio registrado");
        } catch (IOException e) {
            System.out.println("[ERROR NO IDENTIFICADO]");
        }
    }

    public static ArrayList<Socio> usarSociosExistentes() throws FileNotFoundException, IOException {
        FileInputStream fis = new FileInputStream("Tema 7 (Colecciones)/Boletin/src/main/java/ListYSet/Ej1211/socios.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);

        try {
            return (ArrayList<Socio>)ois.readObject();
        } catch (EOFException | ClassNotFoundException e) {
            return null;
        }
    }
}
