package Boletin1.Interfaces.Ej13.Main;

import Boletin1.Interfaces.Ej13.CompararEdadFut;
import Boletin1.Interfaces.Ej13.CompararNombreFut;
import Boletin1.Interfaces.Ej13.Futbolista;

import java.util.Arrays;

public class Pruebas {
    public static void main(String[] args) {
        Futbolista[] futbolistas = {
            new Futbolista("88888888F", "Joseda", 18),
            new Futbolista("49520013R", "Mario", 19),
            new Futbolista("11111111N", "Ana", 34)
        };

        System.out.println("-----------------Antes de Ordenar-----------------");
        imprimirFutbolistas(futbolistas);

        System.out.println("\n-----------------Por DNI-----------------");
        Arrays.sort(futbolistas);
        imprimirFutbolistas(futbolistas);

        System.out.println("\n-----------------Por Nombre-----------------");
        Arrays.sort(futbolistas, new CompararNombreFut());
        imprimirFutbolistas(futbolistas);

        System.out.println("\n-----------------Por edad-----------------");
        Arrays.sort(futbolistas, new CompararEdadFut());
        imprimirFutbolistas(futbolistas);

    }
    private static void imprimirFutbolistas(Futbolista[] futbolistas) {
        for (int i = 0; i < futbolistas.length; i++) {
            System.out.println(futbolistas[i].toString());
        }
    }
}
