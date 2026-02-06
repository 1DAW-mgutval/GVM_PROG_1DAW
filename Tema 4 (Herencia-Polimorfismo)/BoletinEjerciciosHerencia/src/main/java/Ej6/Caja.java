package Ej6;

public class Caja {
    private double ancho, alto, fondo;
    private Unidades u;

    public Caja(double ancho, double alto, double fondo, Unidades u) {
        this.ancho = ancho;
        this.alto = alto;
        this.fondo = fondo;
        this.u = u;
    }

    public double getVolumen() {
        return this.ancho*this.alto*this.fondo;
    }

    @Override
    public String toString() {
        return this.ancho+this.u.toString()+"x"+this.alto+this.u.toString()+"x"+this.fondo+this.u.toString();
    }
}
