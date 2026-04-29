package Ej134;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            
        }
    }

    public static<T> T[] verificarCondicion(T[] tabla, Predicate<T> predicate) {
       return (T[]) Arrays.stream(tabla).filter(predicate).toArray();
    }
}