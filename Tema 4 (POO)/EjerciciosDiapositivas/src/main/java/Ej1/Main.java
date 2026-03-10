package Ej1;

public class Main {
    public static void main(String[] args) {
        CuentaCorriente cuentaJoseda = new CuentaCorriente("49987654F", "Joseda");

        cuentaJoseda.mostrarInformacion();
        cuentaJoseda.sacarDinero(12);
        cuentaJoseda.mostrarInformacion();
        cuentaJoseda.ingresarDinero(156);
        cuentaJoseda.mostrarInformacion();
        cuentaJoseda.sacarDinero(12);
        cuentaJoseda.mostrarInformacion();

    }
}
