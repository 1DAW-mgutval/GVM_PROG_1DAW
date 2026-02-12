package Ej6_7;

public class Caja {
    private double ancho, alto, fondo;
    private Unidades u;
    protected String etiqueta;

    public Caja(double ancho, double alto, double fondo, Unidades u) {
        this.ancho = ancho;
        this.alto = alto;
        this.fondo = fondo;
        this.u = u;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    public double getVolumen() {
        return this.ancho*this.alto*this.fondo;
    }

    @Override
    public String toString() {
        return "Información personal: "+etiqueta+"\n"+this.ancho+this.u.toString()+"x"+this.alto+this.u.toString()+"x"+this.fondo+this.u.toString();
    }
}
