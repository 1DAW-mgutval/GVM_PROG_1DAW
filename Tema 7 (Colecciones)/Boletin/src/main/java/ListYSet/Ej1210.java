package ListYSet;

import java.util.*;

public class Ej1210 {
    public static void main(String[] args) {
//        Lista original
        List<Integer> listaOriginal = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            listaOriginal.add(new Random().nextInt(1, 11));
        }

//        Lista sin repetidos
        Set<Integer> listaNoRepetida = new HashSet<>(listaOriginal);

//        Lista solo con los repetidos
        Set<Integer> listaRepetidos = new HashSet<>();
//        Lista con los que NO se repiten
        Set<Integer> listaUnaVez = new HashSet<>();

        for (Integer num : listaOriginal) {
            int apariciones = 0;
            for (Integer num2 : listaOriginal) {
                if (num.equals(num2)) apariciones++;
            }
            if (apariciones > 1) {
                listaRepetidos.add(num);
            } else {
                listaUnaVez.add(num);
            }
        }


//        Muestro las listas
        System.out.println("Lista original: " + listaOriginal);
        System.out.println("Lista sin números repetidos: " + listaNoRepetida);
        System.out.println("Lista de los números que se repiten: " + listaRepetidos);
        System.out.println("Lista de los números que NO se repiten: " + listaUnaVez);
    }
}
