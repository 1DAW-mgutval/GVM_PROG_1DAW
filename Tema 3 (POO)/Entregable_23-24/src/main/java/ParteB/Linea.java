package ParteB;

public class Linea {
    private double puntoA;
    private double puntoB;

    public Linea () {
        this.puntoA = 0;
        this.puntoB = 0;
    }

    public Linea (Punto puntoA, Punto puntoB) {
        this.puntoA = puntoA.getNumero();
        this.puntoB = puntoB.getNumero();
    }


}
