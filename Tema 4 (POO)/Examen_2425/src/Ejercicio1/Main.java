package Ejercicio1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Pelicula titanic = new Pelicula("Titanic", LocalDate.of(1997, 7, 23), "Drama", "James Cameron");
        Pelicula inception = new Pelicula("Inception", LocalDate.of(2010, 7, 23),"Ciencia Ficción", "Nolan");

        Catalogo catalogo = new Catalogo();
        catalogo.listarPeliculas();
        System.out.println("---PELIS AÑADIDAS---");
        catalogo.agregarPelicula(titanic);
        catalogo.agregarPelicula(inception);
        catalogo.listarPeliculas();

        System.out.println("-----BÚSQUEDAS-----");
        Pelicula[] nolan = catalogo.buscarPeliculas("Nolan","diR");
        System.out.println("Nolan: "+nolan[0].getTitulo());
        Pelicula[] tit = catalogo.buscarPeliculas("TI","TIT");
        System.out.println("Título1: "+tit[0].getTitulo());
        System.out.println("Título2: "+tit[1].getTitulo());
    }
}
