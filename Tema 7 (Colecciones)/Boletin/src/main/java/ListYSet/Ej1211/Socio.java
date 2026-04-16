package ListYSet.Ej1211;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Socio implements Comparable<Socio>, Serializable {
    protected String dni;
    protected String nombre;
    protected Date fechaAlta;

    public Socio(String dni, String nombre, Date fechaAlta) {
        this.dni = dni;
        this.nombre = nombre;
        this.fechaAlta = fechaAlta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Socio socio)) return false;
        return Objects.equals(dni, socio.dni);
    }

    @Override
    public int compareTo(Socio o) {
        return this.dni.compareTo(o.dni);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    @Override
    public String toString() {
        return "Socio con DNI "+dni+" de nombre "+nombre+" y alta en "+fechaAlta+"\n";
    }
}
