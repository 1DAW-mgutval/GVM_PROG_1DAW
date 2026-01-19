package Ej4;

public class Gestor {
    public String nombre;
    String telefono;
    private int importeMaxAutorizado;

    public Gestor (String nombre, String telefono, int importeMaxAutorizado) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.importeMaxAutorizado = importeMaxAutorizado;
    }

    public Gestor (String nombre, String telefono) {
        this(nombre, telefono, 10000);
    }

    public String getTelefono () {
        return  this.telefono;
    }
}
