package Ejercicios.CuentaBancaria;

public class SaldoInsuficienteException extends RuntimeException {
    public SaldoInsuficienteException() {
        super("[ERROR] Saldo insuficiente o no válido");
    }
}
