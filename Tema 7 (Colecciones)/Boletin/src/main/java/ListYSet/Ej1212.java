package ListYSet;

import java.util.HashSet;
import java.util.Set;

public class Ej1212 {
    public static void main(String[] args) {
        Set<Integer> lista1 = new HashSet<>();
        Set<Integer> lista2 = new HashSet<>();
        for (int i = 0; i < 4; i++) {
            lista1.add(i);
            lista2.add(i*10);
        }
        lista1.add(100);
        lista2.add(100);

        System.out.println(union(lista1, lista2));
        System.out.println(interseccion(lista1, lista2));
    }

    private static <E> Set<E> union(Set<E> conjunto1, Set<E> conjunto2) {
        Set<E> res = new HashSet<> (conjunto1);
        res.addAll(conjunto2);
        return res;
    }

    private static <E> Set<E> interseccion(Set<E> conjunto1, Set<E> conjunto2) {
        Set<E> res = new HashSet<>();
        for (E primero : conjunto1) {
            for (E segundo : conjunto2) {
                if (primero.equals(segundo)) res.add(primero);
            }
        }
        return res;
    }
}
