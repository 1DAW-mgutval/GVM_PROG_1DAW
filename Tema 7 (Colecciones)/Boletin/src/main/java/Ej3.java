import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Ej3 {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            lista.add(random.nextInt(1, 11));
        }

        System.out.println(lista);

        while (lista.remove((Integer)5));

        System.out.println(lista);
    }
}
