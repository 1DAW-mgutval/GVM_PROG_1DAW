package Electrodomesticos;

import java.util.Comparator;

public class compararPrecioLavadora implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Lavadora primera = (Lavadora) o1;
        Lavadora segunda = (Lavadora) o2;
        return (int)(primera.getPrecioFinal()-segunda.getPrecioFinal());
    }
}
