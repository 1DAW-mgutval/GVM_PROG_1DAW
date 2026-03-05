package Boletin1.Interfaces.Ej13;

import java.util.Comparator;

public class OrenEdadYNombre implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        int res = 0;
        if (o1 instanceof Futbolista fut1 && o2 instanceof Futbolista fut2) {
            res = fut2.edad - fut1.edad;
            if (res == 0) res = fut2.nombre.compareToIgnoreCase(fut1.nombre);
        }
        return res;
    }
}
