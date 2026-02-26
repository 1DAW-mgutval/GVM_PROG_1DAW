package Carnaval;

import java.util.Comparator;

public class OrdenarPorAutor implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Agrupacion primera = (Agrupacion) o1;
        Agrupacion segunda = (Agrupacion) o2;
        return primera.autor.compareTo(segunda.autor);
    }
}
