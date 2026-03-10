package Ej2;

public class Main {
    public static void main(String[] args) {
        CuentaCorriente cuentaConNombre = new CuentaCorriente("49520013R", "Jorge", 12);
        CuentaCorriente cuentaSinNombre = new CuentaCorriente("2387643F", 987);
        System.out.println("Cuenta con nombre:");
        cuentaConNombre.mostrarInformacion();
        System.out.println("Cuenta sin nombre:");
        cuentaSinNombre.mostrarInformacion();
    }
}
