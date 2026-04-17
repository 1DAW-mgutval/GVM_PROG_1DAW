package Ej132;

public class Cliente {
    String nombre;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
