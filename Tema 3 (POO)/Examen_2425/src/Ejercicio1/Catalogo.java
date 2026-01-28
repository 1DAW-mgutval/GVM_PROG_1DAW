package Ejercicio1;

import java.util.Arrays;

public class Catalogo {
    private Pelicula[] listaPeliculas;

    public Catalogo() {
        this.listaPeliculas = new Pelicula[0];
    }

    public boolean agregarPelicula(Pelicula p) {
        boolean exitoso = true;
        for (int i = 0; this.listaPeliculas.length != 0 && i < this.listaPeliculas.length; i++) {
            if (this.listaPeliculas[i].equals(p)) {
                exitoso = false;
            }
        }
        if (exitoso) {
            this.listaPeliculas = Arrays.copyOf(this.listaPeliculas, this.listaPeliculas.length+1);
            this.listaPeliculas[this.listaPeliculas.length-1] = p;
        }
        return exitoso;
    }

    public void listarPeliculas() {

    }

    public Pelicula[] buscarPeliculas(String cadenaABuscar, String campo) {

    }
}
