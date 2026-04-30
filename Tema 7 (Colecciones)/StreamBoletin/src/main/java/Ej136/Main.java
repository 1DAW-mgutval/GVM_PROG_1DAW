package Ej136;

import java.util.Arrays;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Joseda", 12);
        Cliente c2 = new Cliente("Hugo", 11);
        Cliente c3 = new Cliente("Jorge", 98);

        Cliente[] clientes = {c1, c2, c3};
        paraCada(clientes, x -> System.out.println(x.getNombre()+" tiene "+x.getEdad()+"\n"));
    }

    static <T> void paraCada(T[] tabla, Consumer<T> c) {
        Arrays.stream(tabla)
                .toList()
                .forEach(c);
    }
}