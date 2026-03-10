package Ej2;

public class CuentaCorriente {
    private String dni;
    private String nombre_titular;
    private double saldo;

    public CuentaCorriente (String dni, String nombre_titular, double saldo) {
        this.dni = dni;
        this.nombre_titular = nombre_titular;
        this.saldo = saldo;
    }

    public CuentaCorriente (String dni, double saldo) {
        this(dni, "*SIN NOMBRE*", saldo);
    }

    public void mostrarInformacion() {
        System.out.println("La cuenta a nombre de "+this.nombre_titular+" con DNI "+this.dni+" tiene el siguiente saldo disponible: "+this.saldo);
    }
}
