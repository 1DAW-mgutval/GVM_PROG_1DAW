package ListYSet.Ej1215;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        try {
            Map<Integer, String> productos = new HashMap<>();
            FileOutputStream fos = new FileOutputStream("Tema 7 (Colecciones)/Boletin/src/main/java/ListYSet/Ej1215/productos.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            boolean seguir = true;
            while (seguir) {
                System.out.println("1. Alta\n2. Baja\n3. Actualizar Stock\n4. Salir");
                Scanner sc = new Scanner(System.in);
                int opcion = sc.nextInt();

                switch (opcion) {
                    case 1 -> {
                        Integer codigo = identificarProducto(productos);


                    }
                    case 4 -> seguir = false;
                }
            }
        } catch (FileNotFoundException e) {
            throw new FileNotFoundException();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static Integer identificarProducto(Map<Integer, String> mapa) {
        Integer codigo;
        do {
            System.out.println("Código del producto: ");
            Scanner sc = new Scanner(System.in);
            codigo = sc.nextInt();
        } while (mapa.get(codigo) == null);
        return codigo;
    }
}
