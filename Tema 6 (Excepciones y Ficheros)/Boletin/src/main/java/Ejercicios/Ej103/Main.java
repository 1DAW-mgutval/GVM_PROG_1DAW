package Ejercicios.Ej103;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("Tema 6 (Excepciones y Ficheros)\\Boletin\\src\\main\\java\\Ejercicios\\Ej101\\Main.java");
        BufferedReader br = new BufferedReader(fr);

        String linea = br.readLine();
        while (linea != null) {
            System.out.println(linea);
            linea = br.readLine();
        }
        br.close();
    }
}
