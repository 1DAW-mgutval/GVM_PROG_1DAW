package Ej7;

public class Main {
    public static void main(String[] args) {
        Emisora mario = new Emisora(120);
        mario.subirFrecuencia(65);
        System.out.println("Frecuencia: "+mario.getFrecuencia());
        mario.bajarFrecuencia(15);
        System.out.println("Frecuencia: "+mario.getFrecuencia());
    }
}
