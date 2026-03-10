package Agenda;

import java.util.Arrays;

public class Agenda {
    private Contacto[] misContactos;
    private String propietario;

    public Agenda (Contacto contactoPrimero, String propietario) {
        this.misContactos = new Contacto[1];
        this.misContactos[0] = contactoPrimero;
        this.propietario = propietario;
    }

    public Agenda (String nombre, String telefono, String propietario) {
        this(new Contacto(nombre, telefono), propietario);
    }

    public Agenda (String propietario) {
        this(null, propietario);
    }

    private boolean agendaVacia () {
        boolean vacia = false;
        if (this.misContactos[0] == null) {
            vacia = true;
        }
        return vacia;
    }

    private boolean existeContacto (Contacto contacto) {
        boolean repetido = false;
        if (!this.agendaVacia()) {
            for (int i = 0; i < misContactos.length && !repetido; i++) {
                if (misContactos[i].getTelefono().equals(contacto.getTelefono())) {
                    repetido = true;
                }
            }
        }
        return repetido;
    }

    public boolean anadirContacto (Contacto nuevoContacto) {
        boolean anadido = false;
        if (!existeContacto(nuevoContacto) && !this.agendaVacia()) {
            this.misContactos = Arrays.copyOf(this.misContactos, this.misContactos.length+1);
            this.misContactos[this.misContactos.length-1] = nuevoContacto;
            anadido = true;
        }
        return anadido;
    }

    public void buscarPorNombre (String nombre) {
        boolean encontrado = false;
        if (!this.agendaVacia()) {
            for (int i = 0; i < misContactos.length; i++) {
                if (misContactos[i].getNombre().equals(nombre)) {
                    System.out.println("El contacto " + nombre + " tiene el número de teléfono: " + misContactos[i].getTelefono());
                    encontrado = true;
                }
            }
            if (!encontrado) {
                System.out.println("El contacto no existe.");
            }
        }
    }

    public void mostrarContactosOrdenados () {
        if (!this.agendaVacia()) {
            String nombresOrdenados[] = new String[misContactos.length];
            for (int i = 0; i < nombresOrdenados.length; i++) {
                nombresOrdenados[i] = misContactos[i].getNombre();
            }
            Arrays.sort(nombresOrdenados);

            for (int i = 0; i < nombresOrdenados.length; i++) {
                for (int j = 0; j < misContactos.length; j++) {
                    if (nombresOrdenados[i].equals(misContactos[j].getNombre())) {
                        System.out.println("Contacto " + (i + 1) + "| Nombre: " + misContactos[i].getNombre() + " | Teléfono: " + misContactos[i].getTelefono());
                    }
                }
            }
        } else {
            System.out.println("La agenda está vacía");
        }
    }

    public String getPropietario () {
        return this.propietario;
    }

}
