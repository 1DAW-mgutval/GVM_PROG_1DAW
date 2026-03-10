package Electrodomesticos.Pruebas;

import Electrodomesticos.*;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Electrodomestico[] lista = new Electrodomestico[10];

        Electrodomestico electrodomestico = new Electrodomestico();
        System.out.println(electrodomestico.toString());

        Lavadora lavadora = new Lavadora();
        System.out.println(lavadora.toString());

        Televisor televisor = new Televisor();
        System.out.println(televisor.toString());

        lista[0] = electrodomestico;
        lista[1] = lavadora;
        lista[2] = televisor;

        System.out.println("\n----Prueba----");
        for (int i = 0; i < 3; i++) {
            Electrodomestico electrodomesticoActual = (Electrodomestico) lista[i];
            System.out.println(electrodomesticoActual.toString());
        }

        Lavadora lavadora2 = new Lavadora(10, Color.AZUL, ConsumoElectrico.F, 12, 13.4);
        Lavadora[] lavadoras = {lavadora, lavadora2};

        Arrays.sort(lavadoras);

        Comparator precioLavadora = new compararPrecioLavadora();
        Arrays.sort(lavadoras, precioLavadora);
    }
}
