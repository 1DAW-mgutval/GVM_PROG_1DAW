package Ejercicio1;

import java.time.format.DateTimeFormatter;
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
        if (this.listaPeliculas.length == 0) {
            System.out.println("Ninguna película añadida al catálogo.");
        } else {
            for (int i = 0; i < listaPeliculas.length; i++) {
                System.out.println("Película #"+(i+1)+":");
                System.out.println("Título: "+listaPeliculas[i].getTitulo());
                System.out.println("Director: "+listaPeliculas[i].getDirector());
                System.out.println("Año de lanzamiento: "+listaPeliculas[i].getAnoLanzamiento().format(DateTimeFormatter.ofPattern("yyyy")));
                System.out.println("Género: "+listaPeliculas[i].getGenero()+"\n");
            }
        }
    }

    public Pelicula[] buscarPeliculas(String cadenaABuscar, String campo) {
        Pelicula[] resultado = new Pelicula[0];

        if (campo.equalsIgnoreCase("dir")) {
            for (int i = 0; i < this.listaPeliculas.length; i++) {
                if (this.listaPeliculas[i].getDirector().toLowerCase().contains(cadenaABuscar.toLowerCase())) {
                    resultado = Arrays.copyOf(resultado, resultado.length+1);
                    resultado[resultado.length-1] = this.listaPeliculas[i];
                }
            }
        } else if (campo.equalsIgnoreCase("tit")) {
            for (int i = 0; i < this.listaPeliculas.length; i++) {
                if (this.listaPeliculas[i].getTitulo().toLowerCase().contains(cadenaABuscar.toLowerCase())) {
                    resultado = Arrays.copyOf(resultado, resultado.length+1);
                    resultado[resultado.length-1] = this.listaPeliculas[i];
                }
            }
        } else if (campo.equalsIgnoreCase("gen")) {
            for (int i = 0; i < this.listaPeliculas.length; i++) {
                if (this.listaPeliculas[i].getGenero().toLowerCase().contains(cadenaABuscar.toLowerCase())) {
                    resultado = Arrays.copyOf(resultado, resultado.length+1);
                    resultado[resultado.length-1] = this.listaPeliculas[i];
                }
            }
        } else if (campo.equalsIgnoreCase("año")){
            for (int i = 0; i < this.listaPeliculas.length; i++) {
                if (Integer.valueOf(this.listaPeliculas[i].getAnoLanzamiento().getYear()).equals(Integer.valueOf(cadenaABuscar))) {
                    resultado = Arrays.copyOf(resultado, resultado.length+1);
                    resultado[resultado.length-1] = this.listaPeliculas[i];
                }
            }
        }
        return resultado;
    }
}
