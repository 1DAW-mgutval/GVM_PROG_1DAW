package Ej4;

public class CuentaCorriente {
    private String dni;
    public String nombre_titular;
    double saldo;
    Gestor gestor;
    static String banco;

    public CuentaCorriente(String dni, String nombre_titular, double saldo, Gestor gestor) {
        this.dni = dni;
        this.gestor = gestor;
        this.nombre_titular = nombre_titular;
        this.saldo = saldo;
        banco = "BBVA";
    }

    public CuentaCorriente(String dni, double saldo) {
        this(dni, "*SIN NOMBRE*", saldo, null);
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

    public String getNombreGestor() {
        return this.gestor.getNombre();
    }

    public String getTelefonoGestor() {
        return this.gestor.getTelefono();
    }

    public void setGestor(Gestor gestor) {
        this.gestor = gestor;
    }
}
