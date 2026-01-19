package Ej3;

public class CuentaCorriente {
    private String dni;
    public String nombre_titular;
    double saldo;
    static String banco;

    public CuentaCorriente(String dni, String nombre_titular, double saldo) {
        this.dni = dni;
        this.nombre_titular = nombre_titular;
        this.saldo = saldo;
        banco = "BBVA";
    }

    public CuentaCorriente(String dni, double saldo) {
        this(dni, "*SIN NOMBRE*", saldo);
    }

    public void mostrarInformacion() {
        System.out.println("La cuenta a nombre de "+this.nombre_titular+" con DNI "+this.dni+" tiene el siguiente saldo disponible: "+this.saldo);
    }

    public String getBanco() {
        return CuentaCorriente.banco;
    }

    public void cambiarBanco(String banco) {
        CuentaCorriente.banco = banco;
    }
}
