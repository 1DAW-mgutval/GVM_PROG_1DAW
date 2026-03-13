package Ejercicios.Ej102;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("Tema 6 (Excepciones y Ficheros)\\Boletin\\src\\main\\java\\Ejercicios\\Ej101\\Main.java");

        int caracter = fr.read();
        while (caracter != -1) {
            System.out.print((char) caracter);
            caracter = fr.read();
        }
        fr.close();
    }
}
