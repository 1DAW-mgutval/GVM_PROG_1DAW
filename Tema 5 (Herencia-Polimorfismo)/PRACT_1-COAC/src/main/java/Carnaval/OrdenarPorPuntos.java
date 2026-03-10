package Carnaval;

import java.util.Comparator;

public class OrdenarPorPuntos implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        AgrupacionOficial primera = (AgrupacionOficial) o1;
        AgrupacionOficial segunda = (AgrupacionOficial) o2;
        return segunda.puntos_obtenidos-primera.puntos_obtenidos;
    }
}
