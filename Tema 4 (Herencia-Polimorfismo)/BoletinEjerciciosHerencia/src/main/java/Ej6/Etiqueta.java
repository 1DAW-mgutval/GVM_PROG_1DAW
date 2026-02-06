package Ej6;

public class Etiqueta extends Caja {
    private String destinatario, direccion;

    public Etiqueta(String destinatario, String direccion, double ancho, double alto, double fondo, Unidades u) {
        super(ancho, alto, fondo, u);
        this.destinatario = destinatario;
        this.direccion = direccion;
    }

}
