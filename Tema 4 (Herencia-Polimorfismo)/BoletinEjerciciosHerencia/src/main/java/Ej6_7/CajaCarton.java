package Ej6_7;

public class CajaCarton extends Caja{
    protected double superficie;

    public CajaCarton(double ancho, double alto, double fondo, Integer etiqueta) {
        super(ancho, alto, fondo, Unidades.cm);
        this.setEtiqueta(etiqueta.toString());
        this.superficie = Math.pow(ancho,2)*2+Math.pow(alto,2)*2+Math.pow(fondo,2)*2;
    }

    @Override
    public double getVolumen() {
        return super.getVolumen()*0.8;
    }

    public double getSuperficie() {
        return superficie;
    }
}
