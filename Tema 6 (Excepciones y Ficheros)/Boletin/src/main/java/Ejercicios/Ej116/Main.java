package Ejercicios.Ej116;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Main {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("Tema 6 (Excepciones y Ficheros)/Boletin/src/main/java/Ejercicios/Ej112/cancionPirata.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);

            System.out.println(ois.readObject());
            ois.close();
        } catch (IOException e) {
            System.out.println("[ERROR]");
        } catch (ClassNotFoundException e) {
            System.out.println("Error2");
        }
    }
}
