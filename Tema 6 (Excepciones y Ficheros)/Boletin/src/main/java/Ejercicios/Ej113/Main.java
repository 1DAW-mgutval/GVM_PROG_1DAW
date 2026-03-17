package Ejercicios.Ej113;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cantidad de números a pedir:");
        int indice = 0, cantidad = sc.nextInt();

        double[] tabla = new double[cantidad];
        while (indice < cantidad) {
            System.out.println("Número "+(indice+1));
            tabla[indice] = sc.nextDouble();
            indice++;
        }
        sc.close();

        try {
            FileOutputStream fos = new FileOutputStream("Tema 6 (Excepciones y Ficheros)/Boletin/src/main/java/Ejercicios/Ej113/archivo.dat");
            ObjectOutputStream ous = new ObjectOutputStream(fos);

            ous.writeObject(tabla);
            ous.close();

            mostrarDatos();
        } catch (FileNotFoundException f) {
            System.out.println("ERROR");
        } catch ( IOException i) {
            System.out.println("error");
        }
    }

    public static void mostrarDatos () {
        try {
            FileInputStream fis = new FileInputStream("Tema 6 (Excepciones y Ficheros)/Boletin/src/main/java/Ejercicios/Ej113/archivo.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);

            System.out.println(Arrays.toString((double[]) ois.readObject()));
            ois.close();
        } catch (IOException e) {
            System.out.println("[ERROR]");
        } catch (ClassNotFoundException e) {
            System.out.println("Error2");
        }
    }
}
