package Electrodomesticos;

public class Lavadora extends Electrodomestico{
    protected double carga;

//    Constructores
    public Lavadora(double precioBase, Color color, ConsumoElectrico consumoElectrico, double peso, double carga) {
        super(precioBase, color, consumoElectrico, peso);
        this.carga = carga;
    }

    public Lavadora(double precioBase, double peso) {
        super(precioBase, peso);
        this.carga = 5;
    }

    public Lavadora() {
        this(100, 5);
        this.carga = 5;
    }

//    Getter

    public double getCarga() {
        return carga;
    }

//    Métodos sobreescritos

    @Override
    public double getPrecioFinal() {
        double precioFinal = super.getPrecioFinal();
        if (carga > 30) {
            precioFinal += 30;
        }
        return precioFinal;
    }

    @Override
    public String toString() {
        return "La lavadora tiene un precio base de "+precioBase+"€ y un precio final de "+this.getPrecioFinal()+"€. Es de color "+color+" tiene un consumo "+consumoElectrico+", pesa "+peso+"Kg y tiene una carga de "+carga+"Kg.";
    }
}
