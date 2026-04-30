package Ej135;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Integer[] original = new Integer[10];
        Double[] transformada = new Double[5];
        for (int i = 0; i < original.length; i++) {
            original[i] = new Random().nextInt(1,10);
        }
        for (int i = 0; i < transformada.length; i++) {
            transformada[i] = new Random().nextDouble(15,25);
        }

        System.out.println(Arrays.toString(transformar(original, transformada, x -> Math.sqrt(x))));
    }

    static <T, V> V[] transformar(T[] original, V[] transf, Function<T, V> f) {
        List<V> filtrado = new ArrayList<>(Arrays.stream(original)
                .map(f)
                .toList());
        List<V> transf2 = Arrays.stream(transf).toList();
        filtrado.addAll(transf2);
        return filtrado.toArray(transf);
    }
}
