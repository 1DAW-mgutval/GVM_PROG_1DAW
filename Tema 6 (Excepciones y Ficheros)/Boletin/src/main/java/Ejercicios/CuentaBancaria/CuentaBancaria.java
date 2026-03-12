package Ejercicios.CuentaBancaria;

public class CuentaBancaria {
    int saldo;

    public CuentaBancaria () {
        saldo = 100;
    }

    public void retirarDinero (int dinero) throws SaldoInsuficienteException {
        if (dinero > 0 && dinero <= saldo) {
            saldo -= dinero;
            System.out.println("Dinero retirado");
        } else {
            throw new SaldoInsuficienteException();
        }
    }
}
