package Carnaval.Pruebas;

import Carnaval.COAC;
import Carnaval.Coro;
import Carnaval.Cuarteto;
import Carnaval.Integrante;

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

        System.out.println("\n--------------------PRUEBAS Cuarteto---------------------");
        Cuarteto cuarteto = new Cuarteto("Los glovos", "Jorge", "Melquisedec", "Antonio", "Therians");
        System.out.println(cuarteto.getMiembros_no());
        cuarteto.insertar_integrante(alvaro);
        System.out.println(cuarteto.getMiembros_no());
        cuarteto.eliminar_integrante(hugo);
        cuarteto.insertar_integrante(alvaro);
        cuarteto.eliminar_integrante(alvaro);
        System.out.println(cuarteto.getMiembros_no());

        System.out.println("\n--------------------PRUEBAS COAC---------------------");
        COAC coac = new COAC();
        coac.inscribir_agrupacion(coro);
        coac.inscribir_agrupacion(cuarteto);
        coac.eliminar_agrupacion(cuarteto);
    }
}
