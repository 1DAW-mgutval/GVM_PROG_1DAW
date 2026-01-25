package Ej8;

public class Bombilla {
    private boolean encendida;
    static private boolean interruptorGeneral = true;

    public Bombilla (boolean encendida) {
        this.encendida = encendida;
    }

    public void encender() {
        this.encendida = true;
    }

    public void apagar() {
        this.encendida = false;
    }

    public static void encenderGeneral() {
        interruptorGeneral = true;
    }

    public static void apagarGeneral() {
        interruptorGeneral = false;
    }

    public boolean isEncendida() {
        return this.encendida && interruptorGeneral;
    }
}
