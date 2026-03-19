package FicherosBinarios;

import java.io.*;


//---------------------------------------------------------------------------------------------------CERRAR FLUJOS-------------------------------------------

public class BinariosMain {
    public static void main(String[] args) throws Exception{
//       ESCRITURA
        FileOutputStream fos = new FileOutputStream("FICHERO");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

//        LECTURA
        FileInputStream fis = new FileInputStream("FICHERO");
        ObjectInputStream ois = new ObjectInputStream(fis);

//        BUCLE QUE RECORRE FICHERO BINARIO
        boolean infinito = true;
        while (infinito) {
            try {
                //--------------------------------------------------------------------- implementa SERIALIZABLE ------------------------------------------------------------
                Registro reg = (Registro) ois.readObject();
                System.out.println(reg.toString() + "\n");
            } catch (EOFException e) {
                infinito = false;
            } catch (ClassNotFoundException c) {
                System.out.println("[ERROR] Dato erroneo en los registros");
            }
        }
        ois.close();
        System.out.println("----- FIN DE LOS REGISTROS -----");
    }
}
