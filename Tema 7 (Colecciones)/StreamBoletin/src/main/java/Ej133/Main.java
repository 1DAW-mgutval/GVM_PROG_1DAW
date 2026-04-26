package Ej133;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Joseda");
        Cliente c2 = new Cliente("Hugo");
        Cliente c3 = new Cliente("Jorge");

        List<Cliente> grupo = new ArrayList<>();
        grupo.add(c1);
        grupo.add(c3);
        grupo.add(c2);

        System.out.println(maximo(grupo.toArray(new Cliente[0]), (a,b) -> b.getNombre().compareTo(a.getNombre())));
    }

    public static<T> T maximo(T[] tabla, Comparator<T> comparator) {
        return Arrays.stream(tabla).max(comparator).orElse(null);
    }
}
