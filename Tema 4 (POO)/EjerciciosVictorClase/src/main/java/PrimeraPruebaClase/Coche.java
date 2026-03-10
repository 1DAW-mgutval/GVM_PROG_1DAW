package PrimeraPruebaClase;

public class Coche {
    String color;
    String marca;
    String modelo;
    int numRuedas;
    String matricula;

    public Coche(String color, String marca, String modelo, String matricula, int numRuedas) {
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.numRuedas = numRuedas;
    }

    public Coche () {
        this("", "", "", "",4);
    }

    void pintar (String color) {
        this.color = color;
    }
}
