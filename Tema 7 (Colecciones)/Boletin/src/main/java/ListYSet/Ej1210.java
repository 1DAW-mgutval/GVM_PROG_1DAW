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
        List<Integer> listaRepetidos = new ArrayList<>();
        for (int i = 0; i < listaNoRepetida.size(); i++) {
            Iterator<Integer> iteratorNoRepetida = listaNoRepetida.iterator();
            int repeticiones = 0;
            for (int j = 0; j < listaOriginal.size(); j++) {
                if (iteratorNoRepetida.next().equals(listaOriginal.get(j))) repeticiones++;
            }
            if (repeticiones > 1) listaRepetidos.add(listaOriginal.get(i));
        }

//        Lista con los que NO se repiten


//        Muestro las listas
        System.out.println("Lista original: " + listaOriginal);
        System.out.println("Lista sin números repetidos: " + listaNoRepetida);
        System.out.println("Lista de los números que se repiten: " + listaRepetidos);
    }
}
