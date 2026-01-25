package Ej8;

public class Main {
    public static void main(String[] args) {
        Bombilla cocina = new Bombilla(true);
        System.out.println("La bombilla está: "+cocina.isEncendida());
        Bombilla.apagarGeneral();
        System.out.println("Apago general: "+cocina.isEncendida());
        Bombilla.encenderGeneral();
        System.out.println("Enciendo general: "+cocina.isEncendida());
        cocina.apagar();
        System.out.println("Apago bombilla: "+cocina.isEncendida());
    }
}
