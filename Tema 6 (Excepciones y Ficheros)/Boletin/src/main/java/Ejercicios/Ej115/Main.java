package Ejercicios.Ej115;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("Tema 6 (Excepciones y Ficheros)/Boletin/src/main/java/Ejercicios/Ej111/datos.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);

            System.out.println(Arrays.toString((int[]) ois.readObject()));
        } catch (IOException e) {
            System.out.println("[ERROR]");
        } catch (ClassNotFoundException e) {
            System.out.println("Error2");
        }
    }
}
