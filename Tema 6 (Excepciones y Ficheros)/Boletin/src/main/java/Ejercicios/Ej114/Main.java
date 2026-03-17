package Ejercicios.Ej114;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("Tema 6 (Excepciones y Ficheros)/Boletin/src/main/java/Ejercicios/Ej111/datos.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);

            int[] lista = (int[]) ois.readObject();
        } catch (IOException i) {
            System.out.println("ERROR");
        } catch (ClassNotFoundException i) {
            System.out.println("error");
        }
    }
}
