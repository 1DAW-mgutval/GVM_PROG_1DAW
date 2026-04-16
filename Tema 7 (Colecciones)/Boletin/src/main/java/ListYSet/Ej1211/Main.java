package ListYSet.Ej1211;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try {
            int opcion;
            TreeSet<Socio> listaSocios = usarSociosExistentes();
            FileOutputStream fos = new FileOutputStream("Tema 7 (Colecciones)/Boletin/src/main/java/ListYSet/Ej1211/socios.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            do {
                Scanner sc = new Scanner(System.in);
                System.out.println("--------OPCIONES--------\n1. Alta\n2. Baja\n3. Modificación\n4. Listado por DNI\n5. Listado por antigüedad\n6. Salir");
                opcion = sc.nextInt();

                switch (opcion) {
                    case 1 -> {
                        try {
                            if (listaSocios.add(determinarSocio())) {
                                System.out.println("Socio dado de alta con éxito.\n");
                            } else {
                                System.out.println("El socio ya existía\n");
                            }
                        } catch (ParseException parseException) {
                            System.out.println("[FORMATO DE FECHA NO VÁLIDO] Use -> dd/MM/yyyy\n");
                        }
                    }
                    case 2 -> {
                        try {
                            if (listaSocios.remove(determinarSocio())) {
                                System.out.println("Socio dado de baja con éxito.\n");
                            } else {
                                System.out.println("El socio no existía\n");
                            }
                        } catch (ParseException parseException) {
                            System.out.println("[FORMATO DE FECHA NO VÁLIDO] Use -> dd/MM/yyyy\n");
                        }
                    }
                    case 3 -> {
                        System.out.println("DNI del socio a modificar:");
                        String dni = sc.next();

                        for (Socio socio : listaSocios) {
                            if (socio.getDni().equals(dni)) {
                                System.out.print("Nuevo nombre: ");
                                socio.setNombre(sc.next());
                            }
                        }
                    }
                    case 4 -> {
                        if (!listaSocios.isEmpty()){
                            System.out.println(listaPorDNI(listaSocios));
                        } else {
                            System.out.println("No hay ningún socio dado de alta.");
                        }
                    }
                    case 5 -> {
                        if (!listaSocios.isEmpty()){
                            System.out.println(listaPorAnt(listaSocios));
                        } else {
                            System.out.println("No hay ningún socio dado de alta.");
                        }
                    }
                    case 6 -> {
                        oos.writeObject(listaSocios);
                        System.out.println("Adiós.");
                    }
                    default -> System.out.println("[ERROR] Opción no válida");
                }
            } while (opcion != 6);

            fos.close();
            oos.close();
        } catch (FileNotFoundException e) {
            System.out.println("[ERROR] No hay ningún socio registrado");
        } catch (IOException e) {
            System.out.println("[ERROR NO IDENTIFICADO]");
        }
    }

    public static TreeSet<Socio> usarSociosExistentes() throws FileNotFoundException, IOException {
        try {
            FileInputStream fis = new FileInputStream("Tema 7 (Colecciones)/Boletin/src/main/java/ListYSet/Ej1211/socios.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            return (TreeSet<Socio>)ois.readObject();
        } catch (EOFException | ClassNotFoundException | FileNotFoundException e) {
            return new TreeSet<>();
        }
    }

    public static Socio determinarSocio() throws ParseException {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n DNI del socio:");
        String dni = sc.next();
        System.out.println("Nombre del socio:");
        String nombre = sc.next();
        System.out.println("Fecha de alta del socio:");
        Date fechaAlta = new SimpleDateFormat("dd/MM/yyyy").parse(sc.next());

        return new Socio(dni, nombre, fechaAlta);
    }

    public static List<Socio> listaPorDNI(Collection<Socio> listaSocios) {
        List<Socio> listaOrdenada = new ArrayList<>(listaSocios);
        listaOrdenada.sort(Socio::compareTo);
        return listaOrdenada;
    }

    public static List<Socio> listaPorAnt(Collection<Socio> listaSocios) {
        List<Socio> listaOrdenada = new ArrayList<>(listaSocios);
        listaOrdenada.sort(Comparator.comparing(a -> a.fechaAlta));
        return listaOrdenada;
    }

}