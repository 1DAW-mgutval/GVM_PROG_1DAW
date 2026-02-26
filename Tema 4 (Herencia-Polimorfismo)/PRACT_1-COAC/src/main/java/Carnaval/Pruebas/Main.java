package Carnaval.Pruebas;

import Carnaval.*;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        System.out.println("--------------------PRUEBAS Agrupacion---------------------");
        Coro coro = new Coro("Los Joseda", "Jose David Gil", "Jorge", "Juan", "Furros", 2, 4);
        coro.cantar_la_presentacion();
        coro.hacer_tipo();

        System.out.println("\n--------------------PRUEBAS AgrupacionOficial---------------------");
        Integrante hugo = new Integrante("Hugo", 18, "Tocinas");
        Integrante alvaro = new Integrante("Alvaro", 19, "Sevilla");
        coro.insertar_integrante(hugo);
        coro.insertar_integrante(alvaro);
        coro.insertar_integrante(hugo);
        coro.eliminar_integrante(hugo);
        coro.incrementar_puntos(100);

        System.out.println("\n--------------------PRUEBAS Cuarteto---------------------");
        Cuarteto cuarteto = new Cuarteto("Los Glovos", "Jorge", "Melquisedec", "Antonio", "Therians");
        System.out.println(cuarteto.getMiembros_no());
        cuarteto.insertar_integrante(alvaro);
        System.out.println(cuarteto.getMiembros_no());
        cuarteto.eliminar_integrante(hugo);
        cuarteto.insertar_integrante(alvaro);
        cuarteto.eliminar_integrante(alvaro);
        System.out.println(cuarteto.getMiembros_no());
        cuarteto.incrementar_puntos(20);

        System.out.println("\n--------------------PRUEBAS COAC---------------------");
        COAC coac = new COAC();
        coac.inscribir_agrupacion(coro);
        coac.inscribir_agrupacion(cuarteto);

        coac.ordenarPorNombre();
        coac.ordenarPorAutor();
        coac.ordenarPorPuntos();

        coac.eliminar_agrupacion(cuarteto);
    }
}
