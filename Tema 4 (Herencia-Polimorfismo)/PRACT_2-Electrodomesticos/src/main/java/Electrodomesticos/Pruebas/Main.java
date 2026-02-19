package Electrodomesticos.Pruebas;

import Electrodomesticos.Electrodomestico;
import Electrodomesticos.Lavadora;

public class Main {
    public static void main(String[] args) {
        Electrodomestico electrodomestico = new Electrodomestico();
        System.out.println(electrodomestico.toString());

        Lavadora lavadora = new Lavadora();
        System.out.println(lavadora.toString());
    }
}
