package Ejercicios.Ej104;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("NumerosReales.txt");
        BufferedReader br = new BufferedReader(fr);

        String linea = br.readLine(), numActual = "";
        int indiceActual = 0;
        double suma = 0, media = 0;
        while (indiceActual <= linea.length()) {
            if (indiceActual == linea.length() || linea.charAt(indiceActual) == ' ') {
                suma += Double.valueOf(numActual);
                media ++;
                numActual = "";
            } else {
                numActual += linea.charAt(indiceActual);
            }
            indiceActual++;
        }
        br.close();

        System.out.println("La suma de todos los números es: "+suma);
        System.out.println("La media es: "+(suma/media));
    }
}
