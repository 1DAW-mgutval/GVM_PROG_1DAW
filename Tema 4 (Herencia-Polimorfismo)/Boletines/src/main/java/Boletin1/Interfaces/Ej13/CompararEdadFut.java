package Boletin1.Interfaces.Ej13;

import java.util.Comparator;

public class CompararEdadFut implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        int res = 0;
        if (o1 instanceof Futbolista fut1 && o2 instanceof Futbolista fut2) res = fut1.edad- fut2.edad;
        return res;
    }
}
