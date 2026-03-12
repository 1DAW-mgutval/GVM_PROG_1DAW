package Ejercicio1;

public class Vehiculo implements Comparable {
    protected String marca;
    protected String modelo;

    @Override
    public int compareTo(Object o) {
        int res = 0;
        if (o instanceof Vehiculo otro)  {
            res = this.marca.compareTo(otro.marca);
            if (res == 0) res = this.modelo.compareTo(otro.marca);
        }
        return res;
    }
}
