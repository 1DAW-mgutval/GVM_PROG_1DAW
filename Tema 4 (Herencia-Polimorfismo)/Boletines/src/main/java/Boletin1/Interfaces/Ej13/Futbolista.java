package Boletin1.Interfaces.Ej13;

import java.util.Objects;

public class Futbolista implements Comparable{
    protected String dni;
    protected String nombre;
    protected int edad;
    protected int numGoles;

    public Futbolista(String dni, String nombre, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.numGoles = 0;
    }

    public Futbolista() {
        this("12345678F", "Ejemplo", 18);
    }

    @Override
    public String toString() {
        return "El Futbolista "+this.nombre+" con DNI "+this.dni+" y "+edad+" años de edad, ha marcado "+numGoles+" goles";
    }

    @Override
    public boolean equals(Object o) {
        boolean res = false;
        if (o instanceof Futbolista that) res = this.dni.equals(that.dni);
        return res;
    }

    @Override
    public int compareTo(Object o) {
        int res = 0;
        if (o instanceof Futbolista that) res = this.dni.compareTo(that.dni);
        return res;
    }
}
