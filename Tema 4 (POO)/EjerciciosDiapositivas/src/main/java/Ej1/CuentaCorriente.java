package Ej1;

public class CuentaCorriente {
    private String dni;
    private String nombre_titular;
    private double saldo;

    public CuentaCorriente (String dni, String nombre_titular) {
        this.dni = dni;
        this.nombre_titular = nombre_titular;
        this.saldo = 0;
    }

    public void sacarDinero (double dinero) {
        if (this.saldo >= dinero) {
            this.saldo -= dinero;
        } else {
            System.out.println("La operación no ha sido posible.");
        }
    }

    public void ingresarDinero (double dinero) {
        this.saldo += dinero;
    }

    public void mostrarInformacion() {
        System.out.println("La cuenta a nombre de "+this.nombre_titular+" con DNI "+this.dni+" tiene el siguiente saldo disponible: "+this.saldo);
    }
}
