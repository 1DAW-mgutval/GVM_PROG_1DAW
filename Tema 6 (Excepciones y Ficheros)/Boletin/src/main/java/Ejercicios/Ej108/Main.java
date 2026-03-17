package Ejercicios.Ej108;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime la ruta al fichero:");
        String ruta = sc.next();
        System.out.println("Dime el nombre del fichero a copiar:");
        String fichero = sc.next();
        sc.close();

        try {
            FileReader fr = new FileReader(ruta+fichero);
            BufferedReader br = new BufferedReader(fr);


            FileWriter fw = new FileWriter(ruta+"copia_de_"+fichero);

            String linea;
            while ((linea = br.readLine()) != null) {
                fw.write(linea+'\n');
            }

            br.close();
            fw.close();
        } catch (IOException e) {
            System.out.println("No se ha podido procesar el fichero.");
        }
    }
}
