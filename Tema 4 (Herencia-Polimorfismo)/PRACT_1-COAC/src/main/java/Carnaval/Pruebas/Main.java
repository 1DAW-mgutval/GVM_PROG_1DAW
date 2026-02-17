package Carnaval.Pruebas;

import Carnaval.Coro;
import Carnaval.Integrante;

public class Main {
    public static void main(String[] args) {
        System.out.println("--------------------PRUEBAS Agrupacion---------------------");
        Coro coro = new Coro("Los Joseda", "Jose David Gil", "Jorge", "Juan", "Furros");
        coro.cantar_la_presentacion();
        coro.hacer_tipo();

        System.out.println("\n--------------------PRUEBAS AgrupacionOficial---------------------");
        Integrante hugo = new Integrante("Hugo", 18, "Tocinas");
        Integrante alvaro = new Integrante("Alvaro", 19, "Sevilla");
        coro.insertar_integrante(hugo);
        coro.insertar_integrante(alvaro);
        coro.insertar_integrante(hugo);
        coro.eliminar_integrante(hugo);
    }
}
