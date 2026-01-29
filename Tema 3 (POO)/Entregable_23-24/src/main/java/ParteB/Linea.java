package ParteB;

public class Linea {
    private Punto puntoA;
    private Punto puntoB;

    public Linea (Punto puntoA, Punto puntoB) {
        this.puntoA = puntoA;
        this.puntoB = puntoB;
    }

    public Linea() {
        this.puntoA = new Punto(0,0);
        this.puntoB = new Punto(0,0);
    }

    public void mueveDerecha(double cant) {
        this.puntoA.moverDerecha(cant);
        this.puntoB.moverDerecha(cant);
    }

    public void mueveIzquierda(double cant) {
        this.puntoA.moverIzquierda(cant);
        this.puntoB.moverIzquierda(cant);
    }

    public void mueveArriba(double cant) {
        this.puntoA.moverArriba(cant);
        this.puntoB.moverArriba(cant);
    }

    public void mueveAbajo(double cant) {
        this.puntoA.moverAbajo(cant);
        this.puntoB.moverAbajo(cant);
    }

    public void mostrarLinea() {
        System.out.println("La línea es la: [("+puntoA.getX()+","+puntoA.getY()+"),("+puntoB.getX()+","+puntoB.getY()+")].");
    }

}
