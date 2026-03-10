package Ej4;


public class Main {
    public static void main(String[] args) {

        Gestor jorge = new Gestor("Jorge", "123456789", 1600);
        Gestor joseda = new Gestor("Joseda", "123456789", 1600);

        CuentaCorriente cuenta1 = new CuentaCorriente("49520013R", "Jorge", 12, joseda);
        CuentaCorriente cuenta2 = new CuentaCorriente("49520013R", "Jorge", 12, jorge);

        System.out.println("Nombre gestor: "+cuenta2.getNombreGestor());
        System.out.println("Nombre gestor: "+cuenta1.getNombreGestor());
    }
}
