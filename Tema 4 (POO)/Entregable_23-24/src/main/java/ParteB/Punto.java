package ParteB;

public class Punto {
    private double x;
    private double y;

    public Punto (double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void moverDerecha (double cant) {
        this.x += cant;
    }

    public void moverIzquierda (double cant) {
        this.x -= cant;
    }

    public void moverArriba (double cant) {
        this.y += cant;
    }

    public void moverAbajo (double cant) {
        this.y -= cant;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
