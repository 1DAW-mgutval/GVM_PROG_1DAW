package FicherosTexto;

import java.io.BufferedReader;
import java.io.FileReader;

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
        //        ---------------------------------------------------------ESCRITURA---------------------------------------------------------------------
    }
}
