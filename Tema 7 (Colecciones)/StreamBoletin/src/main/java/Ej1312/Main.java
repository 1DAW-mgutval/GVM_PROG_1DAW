package Ej1312;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        for (int i = 0; i < 40; i++) {
            lista.add(new Random().nextInt(-20, 20));
        }

        System.out.println("Números positivos: "+lista.stream()
                .filter(x -> x > -1)
                .count());

        System.out.println("Números negativos: "+lista.stream()
                .filter(x -> x < 0)
                .count());

        lista.stream()
                .filter(x -> x >= -10 && x <= 10)
                .forEach(x -> System.out.print(x+" | "));
    }
}
