package Ejercicios.Ej112;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String estrofa = "Con diez cañones por banda,\nviento en popa a toda vela,\nno corta el mar, sino vuela\nun velero bergantín";

        try {
            FileOutputStream fos = new FileOutputStream("Tema 6 (Excepciones y Ficheros)/Boletin/src/main/java/Ejercicios/Ej112/cancionPirata.dat");
            ObjectOutputStream ous = new ObjectOutputStream(fos);

            ous.writeObject(estrofa);
            ous.close();

            mostrarDatos();
        } catch (FileNotFoundException e) {
            System.out.println("Fichero no encontrado.");
        } catch (IOException e) {
            System.out.println("ERROR");;
        }

    }

    public static void mostrarDatos () {
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
