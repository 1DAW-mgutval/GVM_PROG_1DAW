package Ejercicios.Ej105;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        double suma = 0;
        boolean seguir = true;
        while (seguir) {
            FileReader fr = new FileReader("numerosPorLinea.txt");
            BufferedReader br = new BufferedReader(fr);
            Scanner sc = new Scanner(br);

            while (sc.hasNext()) {
                try {
                    System.out.println("SUMANDO: " + suma);
                    suma += sc.nextDouble();
                } catch (InputMismatchException e) {
                    System.out.println("[VALOR ERRONEO]");
                    sc.next();
                }
            }
            sc.close();

            System.out.println("La suma es: " + suma);
            System.out.println("¿Seguir?");
            seguir = sc.nextBoolean();
            System.out.println("-------------------------------------");
        }
    }
}
