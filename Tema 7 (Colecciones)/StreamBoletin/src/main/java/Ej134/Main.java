package Ej134;

import java.util.Arrays;
import java.util.Random;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Integer[] array = new Integer[50];
        for (int i = 0; i < 50; i++) {
            array[i] = new Random().nextInt(1,100);
        }
        System.out.println(Arrays.toString(verificarCondicion(array, x -> x % 3 == 0)));
    }

    public static<T> T[] verificarCondicion(T[] tabla, Predicate<T> predicate) {
       return (T[]) Arrays.stream(tabla).filter(predicate).toArray();
    }
}