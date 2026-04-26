package Colecciones;

import java.util.*;

public class Ej2 {
    public static void main(String[] args) {
        List<Integer> listaRepetidos = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            listaRepetidos.add(random.nextInt(2, 9));
        }
        System.out.println(listaRepetidos);

        Set<Integer> listaNueva = new LinkedHashSet<Integer>(listaRepetidos);
        System.out.println(listaNueva);
    }
}
