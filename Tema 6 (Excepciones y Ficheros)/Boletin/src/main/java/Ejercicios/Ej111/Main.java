package Ejercicios.Ej111;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("Tema 6 (Excepciones y Ficheros)/Boletin/src/main/java/Ejercicios/Ej111/datos.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);


            int[] lista = {1,5,7,8,34,23,5,677,12,-3};
            oos.writeObject(lista);

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
