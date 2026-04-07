import java.util.*;

public class Ej4 {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            lista.add(random.nextInt(1, 31));
        }
        System.out.println(lista);

        Integer[] array = lista.toArray(new Integer[0]);
        Arrays.sort(array);
//        Creo una nueva ArrayList, ya que si lo igualo directamente al array tengo 2 variables apuntando a la misma dirección de memoria.
        lista = new ArrayList<>(Arrays.asList(array));
        System.out.println(lista);

        Arrays.sort(array, Collections.reverseOrder());
        lista = new ArrayList<>(Arrays.asList(array));
        System.out.println(lista);

    }
}
