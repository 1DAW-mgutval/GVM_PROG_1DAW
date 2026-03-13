package Ejercicios.Ej107;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("Tema 6 (Excepciones y Ficheros)\\Boletin\\src\\main\\java/Ejercicios\\Ej107\\lamancha.txt");

        String texto = "En un lugar de La Mancha,\nde cuyo nombre no quiero acordarme";

        for (int i = 0; i < texto.length() ; i++) {
            if (texto.charAt(i) != '\n') {
                fw.write(texto.charAt(i));
            } else {
                fw.write(texto.substring(i,texto.length()-1));
                i = texto.length();
            }
        }
    }
}
