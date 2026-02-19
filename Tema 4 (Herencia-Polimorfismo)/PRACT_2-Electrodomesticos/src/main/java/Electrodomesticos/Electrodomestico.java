package Electrodomesticos;

public class Electrodomestico {
    protected double precioBase;
    protected Color color;
    protected ConsumoElectrico consumoElectrico;
    protected double peso;

//    Constructores
    public Electrodomestico(double precioBase, Color color, ConsumoElectrico consumoElectrico, double peso) {
        this.precioBase = precioBase;
        this.color = color;
        this.consumoElectrico = consumoElectrico;
        this.peso = peso;
    }

    public Electrodomestico(double precioBase, double peso) {
        this(precioBase, Color.BLANCO, ConsumoElectrico.F, peso);
    }

    public Electrodomestico() {
        this(100, 5);
    }

//    Getters de los atributos
    public double getPrecioBase() {
        return precioBase;
    }

    public Color getColor() {
        return color;
    }

    public ConsumoElectrico getConsumoElectrico() {
        return consumoElectrico;
    }

    public double getPeso() {
        return peso;
    }

    public double getPrecioFinal() {
        double precioFinal = this.precioBase;
        switch (this.consumoElectrico) {
            case A -> precioFinal += 100;
            case B -> precioFinal += 80;
            case C -> precioFinal += 60;
            case D -> precioFinal += 50;
            case E -> precioFinal += 30;
            case F -> precioFinal += 10;
        }

        if (this.peso >= 0 && this.peso < 30) {
            precioFinal += 10;
        } else if (this.peso >= 30 && this.peso < 50) {
            precioFinal += 60;
        } else if (this.peso >= 50 && this.peso < 80) {
            precioFinal += 80;
        } else if (this.peso >= 80) {
            precioFinal += 100;
        }
        return precioFinal;
    }

    @Override
    public String toString() {
        return "El electrodoméstico tiene un precio base de "+precioBase+"€ y un precio final de "+getPrecioFinal()+"€. Es de color "+color+" tiene un consumo "+consumoElectrico+" y pesa "+peso+"Kg.";
    }


}
