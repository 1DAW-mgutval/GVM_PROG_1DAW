package Ej5;

public class Main {
    public static void main(String[] args) {
        Hora ahora = new Hora();
        ahora.setHora(23);
        ahora.setMinuto(59);
        ahora.setSegundo(58);

        System.out.println("Hora: "+ahora.getHora()+" | Min: "+ahora.getMinuto()+" | Seg: "+ahora.getSegundo());
        ahora.incrementarHora(10);
        System.out.println("Hora: "+ahora.getHora()+" | Min: "+ahora.getMinuto()+" | Seg: "+ahora.getSegundo());
    }
}
