package ListYSet.Ej1215;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        try {
            Map<Integer, Integer> productos = obtenerProductos();
            FileOutputStream fos = new FileOutputStream("Tema 7 (Colecciones)/Boletin/src/main/java/ListYSet/Ej1215/productos.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            Scanner sc = new Scanner(System.in);

            boolean seguir = true;
            while (seguir) {
                System.out.println("1. Alta\n2. Baja\n3. Actualizar Stock\n4. Salir\n5. Mostrar productos");
                int opcion = sc.nextInt();

                switch (opcion) {
                    case 1 -> {
                        System.out.println("Código de producto:");
                        Integer codigo = sc.nextInt();
                        System.out.println("Stock de producto:");
                        Integer stock = sc.nextInt();
                        productos.put(codigo, stock);
                    } case 2 -> {
                        Integer codigo = identificarProducto(productos);
                        if (codigo != null) productos.remove(codigo);
                    } case 3 -> {
                        Integer codigo = identificarProducto(productos);
                        System.out.println("Nuevo stock:");
                        if (codigo != null) productos.replace(codigo, sc.nextInt());
                    } case 4 -> {
                        seguir = false;
                        oos.writeObject(productos);
                    } case 5 -> {
                        System.out.println(productos);
                    } default -> System.out.println("OPCIÓN NO VÁLIDA");
                }
            }
        } catch (FileNotFoundException e) {
            throw new FileNotFoundException();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static Integer identificarProducto(Map<Integer, Integer> mapa) {
        Integer codigo;
        do {
            System.out.println("Código del producto (-1 para salir): ");
            Scanner sc = new Scanner(System.in);
            codigo = sc.nextInt();
        } while (mapa.get(codigo) == null && codigo != -1);
        if (codigo == -1) codigo = null;
        return codigo;
    }

    public static Map<Integer, Integer> obtenerProductos () throws FileNotFoundException, IOException {
        FileInputStream fis = new FileInputStream("Tema 7 (Colecciones)/Boletin/src/main/java/ListYSet/Ej1215/productos.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Map<Integer, Integer> productos = new HashMap<>();
        try {
            productos = (Map<Integer, Integer>) ois.readObject();
        } catch (EOFException ignored){
        } catch (ClassNotFoundException ignored) {
        }
        return productos;
    }
}
