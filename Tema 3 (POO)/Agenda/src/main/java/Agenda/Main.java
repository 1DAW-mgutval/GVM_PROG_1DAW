package Agenda;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean seguir = true;
        int opcion;
        Agenda agendas[] = new Agenda[1];
        String agendaTemp, nombreContacto, telefonoContacto;
        int agendaSeleccionada;
        System.out.println("-----BIENVENIDO A LA AGENDA-----");
        while (seguir) {
            System.out.println("Operaciones que puede realizar: \n 1. Crear Agenda \n 2. Añadir Contacto \n 3. Buscar Teléfono \n 4. Mostrar contactos ordenados \n 5. SALIR");
            opcion = sc.nextInt();
            while (opcion > 5 || opcion < 1) {
                System.out.println("ERROR. Opción no válida, vuelve a intentarlo.");
                opcion = sc.nextInt();
            }

            if (opcion == 1){
                System.out.println("Dime el nombre de la nueva Agenda");
                agendaTemp = sc.next();
                anadirAgenda(agendas, agendaTemp);
            } else if (opcion == 2) {
                if (existenAgendas(agendas)) {
                    System.out.println("Selecciona la agenda a la cual quieres añadir el contacto. Lista de agendas:");
                    mostrarAgendas(agendas);
                    agendaTemp = sc.next();
                    System.out.println("Dime el nombre del nuevo contacto:");
                    nombreContacto = sc.next();
                    System.out.println("Dime el teléfono del nuevo contacto:");
                    telefonoContacto = sc.next();

                    agendaSeleccionada = buscarAgenda(agendas, agendaTemp);
                    if (agendas[agendaSeleccionada].anadirContacto(new Contacto(nombreContacto, telefonoContacto))) {
                        System.out.println("Contacto añadido con éxito.");
                    } else {
                        System.out.println("El contacto ya existe.");
                    }
                } else {
                    System.out.println("No existe ninguna agenda, debe de crear una.");
                    System.out.println("Nombre de la agenda:");
                    agendaTemp = sc.next();
                    System.out.println("Dime el nombre del nuevo contacto:");
                    nombreContacto = sc.next();
                    System.out.println("Dime el teléfono del nuevo contacto:");
                    telefonoContacto = sc.next();

                    anadirAgenda(agendas, agendaTemp);
                    if (agendas[agendas.length-1].anadirContacto(new Contacto(nombreContacto, telefonoContacto))) {
                        System.out.println("Contacto añadido con éxito.");
                    }
                }
            } else if (opcion == 3) {
                if (existenAgendas(agendas)) {
                    System.out.println("Dime la agenda en la que quieres buscar");
                    mostrarAgendas(agendas);
                    do {
                        agendaTemp = sc.next();
                        if (buscarAgenda(agendas, agendaTemp) == -1) {
                            System.out.print("Agenda no válida, vuelve a intentarlo.");
                        }
                    } while (buscarAgenda(agendas, agendaTemp) == -1);
                    System.out.println("Dime el nombre del teléfono a buscar:");
                    nombreContacto = sc.next();

                    agendaSeleccionada = buscarAgenda(agendas, agendaTemp);
                    agendas[agendaSeleccionada].buscarPorNombre(nombreContacto);
                } else {
                    System.out.println("ERROR. No existe ninguna agenda.");
                }
            } else if (opcion == 4) {
                if (existenAgendas(agendas)) {
                    System.out.println("Dime la agenda en la que quieres buscar");
                    mostrarAgendas(agendas);
                    agendaTemp = sc.next();

                    agendaSeleccionada = buscarAgenda(agendas, agendaTemp);
                    agendas[agendaSeleccionada].mostrarContactosOrdenados();
                }
            } else {
                seguir = false;
            }
        }
        System.out.println("ADIÓS.");
    }

    public static int buscarAgenda (Agenda agendas[], String buscar) {
        int indice = -1;
        for (int i = 0; i < agendas.length && indice == -1; i++) {
            if (agendas[i].equals(buscar)) {
                indice = i;
            }
        }
        return indice;
    }

    public static void mostrarAgendas (Agenda agendas[]) {
        if (agendas.length > 0) {
            for (int i = 0; i < agendas.length; i++) {
                System.out.println((i + 1) + " " + agendas[i].getPropietario());
            }
        } else {
            System.out.println("No hay ninguna agenda creada.");
        }
    }

    public static boolean existenAgendas (Agenda agendas[]) {
        boolean existe = true;
        if (agendas[0] == null) {
            existe = false;
        }
        return existe;
    }

    public static void anadirAgenda (Agenda agendas[], String agendaNueva) {
        if (agendas.length == 1) {
            agendas[agendas.length-1] = new Agenda(agendaNueva);
        } else {
            agendas = Arrays.copyOf(agendas, agendas.length+1);
            agendas[agendas.length-1] = new Agenda(agendaNueva);
        }
    }
}
