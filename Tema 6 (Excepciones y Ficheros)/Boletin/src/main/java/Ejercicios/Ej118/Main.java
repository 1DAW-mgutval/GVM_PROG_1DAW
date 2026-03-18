package Ejercicios.Ej118;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Socio[] socios = {new Socio(), new Socio(), new Socio()};

        try {
            FileOutputStream fos = new FileOutputStream("Tema 6 (Excepciones y Ficheros)/Boletin/src/main/java/Ejercicios/Ej118/socio.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(socios);
            oos.close();

            try {
                FileInputStream fis = new FileInputStream("Tema 6 (Excepciones y Ficheros)/Boletin/src/main/java/Ejercicios/Ej118/socio.dat");
                ObjectInputStream ois = new ObjectInputStream(fis);

                while (true) {
                    System.out.println(Arrays.toString((Socio[])ois.readObject()));
                }
            } catch (EOFException eofException) {
                System.out.println("FIN DEL ARCHIVO");
            }
        } catch (Exception e) {
            System.out.println("ERROR");
        }
    }
}
