package Ejercicios.Ej119;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean seguir = true;
        while (seguir) {
            try {
                Scanner sc = new Scanner(System.in);

                System.out.println("1. Añadir nuevo registro\n2. Ver histórico de registros\n3. Finalizar el programa");
                int opcion = sc.nextInt();
                switch (opcion) {
                    case 1 -> {
                        FileOutputStream fos = new FileOutputStream("Tema 6 (Excepciones y Ficheros)/Boletin/src/main/java/Ejercicios/Ej119/temperatura.dat", true);
                        ObjectOutputStream oos = new ObjectOutputStream(fos);

                        System.out.println("\nTemperatura en ºC:");
                        int temp = sc.nextInt();
//                        ---------------------------------------------------------------- PREGUNTAR A VICTOR POR QUÉ SOLO PUEDO GUARDAR 1 REGISTRO
                        oos.writeObject(new Registro(temp));
                        oos.close();
                    }
                    case 2 -> {
                        FileInputStream fis = new FileInputStream("Tema 6 (Excepciones y Ficheros)/Boletin/src/main/java/Ejercicios/Ej119/temperatura.dat");
                        ObjectInputStream ois = new ObjectInputStream(fis);

                        boolean infinito = true;
                        while (infinito) {
                            try {
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
                    case 3 -> seguir = false;
                    default -> System.out.println("Opción incorrecta, vuelve a intentarlo.");
                }

            } catch (FileNotFoundException fnf) {
                System.out.println("[ERROR] Archivo no encontrado");
            } catch (InputMismatchException i) {
                System.out.println("[ERROR] Dato introducido incorrecto, no se guardará el registro.");
            } catch (IOException ioe) {
                System.out.println("[ERROR DESCONOCIDO]");
            }
        }
    }
}
