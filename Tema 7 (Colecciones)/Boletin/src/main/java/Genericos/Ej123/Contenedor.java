package Genericos.Ej123;

import java.util.Arrays;

public class Contenedor<T> implements Pila<T> {
    private T[] pila;

    public Contenedor() {
        pila = (T[]) new Object[0];
    }

    public void apilar(T nuevo) {
        pila = Arrays.copyOf(pila, pila.length+1);
        pila[pila.length-1] = nuevo;
    }

    public T desapilar() {
        T quitado = pila[pila.length-1];
        pila = Arrays.copyOfRange(pila, 0, pila.length-1);
        return quitado;
    }

    @Override
    public int size() {
        return pila.length;
    }

    @Override
    public String toString() {
        return Arrays.toString(pila);
    }
}
