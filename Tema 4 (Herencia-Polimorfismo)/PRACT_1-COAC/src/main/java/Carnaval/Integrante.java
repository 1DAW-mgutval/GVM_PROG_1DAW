package Carnaval;

import java.util.Objects;

public class Integrante {
    static int ultimoNumParticipante = 0;

    protected int numero_participante;
    protected String nombre;
    protected int edad;
    protected String localidad;

    public Integrante (String nombre, int edad, String localidad) {
        ultimoNumParticipante++;
        this.numero_participante = ultimoNumParticipante;

        this.nombre = nombre;
        this.edad = edad;
        this.localidad = localidad;
    }

    @Override
    public boolean equals(Object o) {
        boolean igual = false;
        if (o != null) {
            Integrante that = (Integrante) o;
            if (this.numero_participante == that.numero_participante && this.nombre.equals(that.nombre)) igual = true;
        }
        return igual;
    }
}
