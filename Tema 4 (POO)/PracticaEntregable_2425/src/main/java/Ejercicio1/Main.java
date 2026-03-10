package Ejercicio1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
//        Creación de un restaurante
        Restaurante bar1 = new Restaurante();

//        Creación de 3 platos
        Plato chocos = new Plato("Chocos" , 4.50, 16);
        Plato ensaladilla = new Plato("Ensaladilla" , 10000, categoriaPlato.MENU, 16);
        Plato pinchito = new Plato("Pinchito" , 3.45, categoriaPlato.RACIO , 2);

//        Creación de 3 empleados
        Empleado mario = new Empleado("Mario", "6453276328", LocalDate.now(), tipoEmpleado.GERENTE);
        Empleado joseda = new Empleado("Joseda", "12345678", LocalDate.of(2007,1,8));
        Empleado jorge = new Empleado("Jorge", "12345678", LocalDate.now(), tipoEmpleado.RESPONSABLE);

//        Añado los empleados y platos al restaurante.
        bar1.anadirPlato(chocos);
        bar1.anadirPlato(ensaladilla);
        bar1.anadirPlato(pinchito);

        bar1.anadirTrabajador(mario);
        bar1.anadirTrabajador(joseda);
        bar1.anadirTrabajador(jorge);

//        Mostrar lista de platos
        System.out.println("----PLATOS----");
        bar1.mostrarPlatos();
        System.out.println("----EMPLEADOS----");
        bar1.mostrarListaEmpleados();
        System.out.println("----UNIDADES PLATOS----");
        bar1.mostrarUnidadesPlatos();


    }
}
