package ParteA;

public class Cafetera {
    private int capacidadMaxima;
    private int cantidadActual;
    private Persona dueno;

    public Cafetera (int capacidadMaxima, int cantidadActual, Persona dueno) {
        this.capacidadMaxima = capacidadMaxima;
        if (cantidadActual > this.capacidadMaxima) {
            this.cantidadActual = this.capacidadMaxima;
        } else {
            this.cantidadActual = cantidadActual;
        }
        this.dueno = dueno;
    }

    public Cafetera () {
        this(1, 0, new Persona("Pepe"));
    }

    public void llenarCafetera() {
        this.cantidadActual = this.capacidadMaxima;
    }

    public void servirTaza(int cantidad) {
        this.cantidadActual -= cantidad;
        if (this.cantidadActual < 0) {
            this.cantidadActual = 0;
        }
    }

    public void vaciarCafetera() {
        this.cantidadActual = 0;
    }

    public void agregarCafe(int cantidad) {
        this.cantidadActual += cantidad;
        if (this.cantidadActual > this.capacidadMaxima) {
            this.cantidadActual = this.capacidadMaxima;
        }
    }

    public void mostrarCafeDisponible() {
        System.out.println("La cafetera de "+this.dueno.getNombre()+" tiene una capacidad de "+this.capacidadMaxima+" litros y tiene actualmente "+this.cantidadActual+" de café.");
    }

}
