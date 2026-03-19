package FicherosTexto;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

//---------------------------------------------------------------------------------------------------CERRAR FLUJOS-------------------------------------------

public class TextoPlanoMain {
    public static void main(String[] args) throws Exception {
//        ---------------------------------------------------------LECTURA---------------------------------------------------------------------
//        CARACTER A CARACTER
        FileReader fr = new FileReader("EJEMPLO");

        int caracter = fr.read();
        while (caracter != -1) {
            System.out.print((char) caracter);
            caracter = fr.read();
        }
        fr.close();

//        LÍNEA A LÍNEA
        FileReader fr2 = new FileReader("EJEMPLO");
        BufferedReader br = new BufferedReader(fr2);

        String linea = br.readLine();
        while (linea != null) {
            System.out.println(linea);
            linea = br.readLine();
        }
        br.close();

//        CON SCANNER
        FileReader fr3 = new FileReader("EJEMPLO");
        BufferedReader br3 = new BufferedReader(fr3);
        Scanner sc = new Scanner(br3);

        double suma = 0;
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
        //        ---------------------------------------------------------ESCRITURA---------------------------------------------------------------------
//        NORMAL
        FileWriter fw = new FileWriter("EJEMPLO");
//        PARA MÁS EFICIENCIA
        BufferedWriter bw = new BufferedWriter(fw);

        String texto = "En un lugar de La Mancha,\nde cuyo nombre no quiero acordarme";

//        Condición TRUE caracter a caracter. Condición FALSE String
        for (int i = 0; i < texto.length() ; i++) {
            if (texto.charAt(i) != '\n') {
                fw.write(texto.charAt(i));
            } else {
                fw.write(texto.substring(i));
                i = texto.length();
            }
        }
        fw.close();

    }
}
