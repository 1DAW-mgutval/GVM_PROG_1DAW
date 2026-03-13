package Ejercicios.Ej106;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("Enteros.txt");
        Scanner sc = new Scanner(fr);

        int c = 0;
        double suma = 0, media = 0;
        while (c != -1) {
            if (sc.hasNextDouble()) {
                suma += sc.nextDouble();
                media++;
            } else {
                c = fr.read();
            }
        }
        sc.close();

        System.out.println("Suma = "+suma);
        System.out.println("Media = "+(suma/media));
    }
}
