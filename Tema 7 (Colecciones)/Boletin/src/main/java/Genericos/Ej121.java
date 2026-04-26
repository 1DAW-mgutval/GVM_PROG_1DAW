package Genericos;

import java.util.Arrays;

public class Ej121 {
    public static void main(String[] args) {
        Integer[] num = {4,7};
        System.out.println(Arrays.toString(insercion(num, 100)));
    }
    public static <T> T[] insercion(T[] tabla, T objeto) {
        tabla = Arrays.copyOf(tabla, tabla.length+1);
        tabla[tabla.length-1] = objeto;
        return tabla;
    }
}
