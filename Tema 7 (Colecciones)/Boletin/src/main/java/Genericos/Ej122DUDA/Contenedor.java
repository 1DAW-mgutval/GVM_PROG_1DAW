package Genericos.Ej122DUDA;

import javax.swing.plaf.PanelUI;
import java.util.Arrays;

public class Contenedor<T> {
    private T[] tabla;

    public Contenedor() {
        tabla = (T[]) new Object[0];
    }

    @Override
    public String toString() {
        return "Contenedor{" +
                "tabla=" + Arrays.toString(tabla) +
                '}';
    }

    public void insertarAlFinal(T nuevo) {
        tabla = Arrays.copyOf(tabla, tabla.length+1);
        tabla[tabla.length-1] = nuevo;
    }

    public void insertarAlPrincipio(T nuevo) {
        T[] nuevaT = (T[]) new Object[tabla.length+1];
        nuevaT[0] = nuevo;
        for (int i = 1; i < nuevaT.length; i++) {
            nuevaT[i] = tabla[i-1];
        }
        tabla = nuevaT;
    }

    public T extraerDelPrincipio() {
        return tabla[0];
    }

    public T extraerDelFinal() {
        return tabla[tabla.length-1];
    }

    public void ordenar() {
        Arrays.sort(tabla);
    }
}