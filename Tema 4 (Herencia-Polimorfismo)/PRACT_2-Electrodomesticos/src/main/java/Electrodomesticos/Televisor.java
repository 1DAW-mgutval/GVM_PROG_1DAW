package Electrodomesticos;

public class Televisor extends Electrodomestico{
    protected double resolucion;
    protected boolean sintonizadorTDT;

//    Constructores
    public Televisor(double precioBase, Color color, ConsumoElectrico consumoElectrico, double peso, double resolucion, boolean sintonizadorTDT) {
        super(precioBase, color, consumoElectrico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public Televisor(double precioBase, double peso) {
        super(precioBase, peso);
        this.resolucion = 20;
        this.sintonizadorTDT = false;
    }

    public Televisor() {
        this.resolucion = 20;
        this.sintonizadorTDT = false;
    }

//    Getters
    public double getResolucion() {
        return resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

//    Overrides

    @Override
    public String toString() {
        return "Este televisor tiene un precio base de "+precioBase+"€ y un precio final de "+this.getPrecioFinal()+"€. Es de color "+color+" tiene un consumo "+consumoElectrico+", pesa "+peso+"Kg. Tiene "+this.resolucion+" pulgadas y el uso de TDT es "+this.sintonizadorTDT;
    }

    @Override
    public double getPrecioFinal() {
        double precioFinal = super.getPrecioFinal();
        if (this.resolucion > 40) precioFinal *= 1.3;
        if (this.sintonizadorTDT) precioFinal += 50;
        return precioFinal;
    }
}
