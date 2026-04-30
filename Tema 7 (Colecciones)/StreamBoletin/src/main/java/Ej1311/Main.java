package Ej1311;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Joseda", 12);
        Cliente c2 = new Cliente("Hugo", 11);
        Cliente c3 = new Cliente("Jorge", 98);

        Cliente[] clientes = {c1, c2, c3};
        Stream.of(clientes)
                .sorted((a,b) -> a.getNombre().compareTo(b.getNombre()))
                .forEach(a -> System.out.println(a.getNombre()+" "+a.getEdad()));
    }
}