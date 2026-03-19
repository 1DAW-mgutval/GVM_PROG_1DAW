package Ejercicio1;

public class Vehiculo implements Comparable {
    protected String marca;
    protected String modelo;

    public Vehiculo () {
        this.marca = "";
        this.modelo = "";
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public int compareTo(Object o) {
        int res = 0;
        if (o instanceof Vehiculo otro)  {
            res = this.marca.compareTo(otro.marca);
            if (res == 0) res = this.modelo.compareTo(otro.modelo);
        }
        return res;
    }
}
