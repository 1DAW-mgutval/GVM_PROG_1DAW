package Ejercicios.CuentaBancaria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SaldoInsuficienteException {
        Scanner sc = new Scanner(System.in);
        CuentaBancaria cuenta = new CuentaBancaria();

        System.out.println("Saldo a retirar");
        int dinero = sc.nextInt();

        try {
            cuenta.retirarDinero(dinero);
        } catch (SaldoInsuficienteException e) {
            throw new SaldoInsuficienteException();
        }
    }
}
