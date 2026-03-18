package Ejercicios.Ej117;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            FileOutputStream fos = new FileOutputStream("Tema 6 (Excepciones y Ficheros)/Boletin/src/main/java/Ejercicios/Ej117/numeros.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            boolean seguir = true;
            int numero;
            while (seguir) {
                System.out.println("Número a guardar:");
                numero = sc.nextInt();
                if (numero == -1) {
                    System.out.println("FIN\n");
                    seguir = false;
                } else if (numero > -1) {
                    System.out.println("Número guardado.\n");
                    oos.writeInt(numero);
                } else {
                    System.out.println("El número es negativo, no se guardará.\n");
                }
            }
            sc.close();
            oos.close();

            FileOutputStream fos2 = new FileOutputStream("Tema 6 (Excepciones y Ficheros)/Boletin/src/main/java/Ejercicios/Ej117/numerosCopia.dat");
            ObjectOutputStream oos2 = new ObjectOutputStream(fos2);

            FileInputStream fis = new FileInputStream("Tema 6 (Excepciones y Ficheros)/Boletin/src/main/java/Ejercicios/Ej117/numeros.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);

            int num;
            while (ois.available() > 0) {
                num = ois.readInt();
                System.out.println(num);
                oos2.writeInt(num);
            }
            oos2.close();
            ois.close();
        } catch (Exception e) {
            System.out.println("ERROR");
        }


    }
}
