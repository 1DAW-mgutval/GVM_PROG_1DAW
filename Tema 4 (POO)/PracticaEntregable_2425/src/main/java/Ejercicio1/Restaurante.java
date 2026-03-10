package Ejercicio1;

import java.util.Arrays;

public class Restaurante {
    public static final String nombre = "Bar Manolo";

    private Plato[] listaPlatos;
    private Empleado[] listaEmpleados;

    public Restaurante (Plato[] listaPlatos, Empleado[] listaEmpleados) {
        this.listaPlatos = listaPlatos;
        this.listaEmpleados = listaEmpleados;
    }

    public Restaurante () {
        this.listaPlatos = new Plato[0];
        this.listaEmpleados = new Empleado[0];
    }

    public void anadirPlato (Plato platoNuevo) {
        this.listaPlatos = Arrays.copyOf(this.listaPlatos, this.listaPlatos.length+1);
        this.listaPlatos[this.listaPlatos.length-1] = platoNuevo;
    }

    public void anadirTrabajador (Empleado empleadoNuevo) {
        this.listaEmpleados = Arrays.copyOf(this.listaEmpleados, this.listaEmpleados.length+1);
        this.listaEmpleados[this.listaEmpleados.length-1] = empleadoNuevo;
    }

    public boolean eliminarEmpleado (int idEmpleado) {
        boolean exitoso = false;
        for (int i = 0; i < this.listaEmpleados.length; i++) {
            if (this.listaEmpleados[i].getId() == idEmpleado) {
                this.listaEmpleados = null;
                exitoso = true;
            }
        }
        if (exitoso) {
            Empleado listaNueva[] = new Empleado[this.listaEmpleados.length-1];
            for (int i = 0; i < this.listaEmpleados.length ; i++) {
                for (int j = 0; j < listaNueva.length; j++) {
                    if (this.listaEmpleados[i] != null) {
                        this.listaEmpleados[i] = listaNueva[j];
                    }
                }
            }
            this.listaEmpleados = Arrays.copyOf(listaNueva, listaNueva.length);
            listaNueva = null;
        }
        return exitoso;
    }

    public void mostrarPlatos () {
        for (int i = 0; i < listaPlatos.length; i++) {
            System.out.println("Plato nº "+(i+1)+": "+listaPlatos[i].getNombre());
        }
    }

    public void mostrarUnidadesPlatos () {
        for (int i = 0; i < listaPlatos.length; i++) {
            System.out.println("Plato "+listaPlatos[i].getNombre()+" -> Cantidad disponible: "+listaPlatos[i].getUnidades());
        }
    }

    public void mostrarListaEmpleados () {
        for (int i = 0; i < listaEmpleados.length; i++) {
            listaEmpleados[i].mostrarDatos();
        }
    }

}
