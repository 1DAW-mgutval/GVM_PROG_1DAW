package Ej4;


public class Main {
    public static void main(String[] args) {
        CuentaCorriente cuentaConNombre = new CuentaCorriente("49520013R", "Jorge", 12);
        CuentaCorriente cuenta2 = new CuentaCorriente("49520013R", "Jorge", 12);
        System.out.println("Banco: "+cuentaConNombre.getBanco());

        cuentaConNombre.cambiarBanco("Santander");

        System.out.println("Banco: "+cuenta2.getBanco());
    }
}
