package Ejercicio1;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.time.temporal.TemporalAccessor;

public class Pelicula {
    public static final String productora = "WARNER";

    private String titulo;
    private String director;
    private LocalDate anoLanzamiento;
    private String genero;

    public Pelicula (String titulo, LocalDate anoLanzamiento, String genero, String director) {
        this.titulo = titulo;
        if (this.titulo.length() > 30) {
            this.titulo = this.titulo.substring(0,30);
        }
        this.anoLanzamiento = anoLanzamiento;
        if (this.anoLanzamiento.isBefore(LocalDate.of(1900,1,1))) {
            this.anoLanzamiento = LocalDate.of(1900,1,1);
        }
        this.genero = genero;
        this.director = director;
    }

    public Pelicula (String titulo, LocalDate anoLanzamiento, String genero) {
        this(titulo, anoLanzamiento, genero, "");
    }

    public void addGenero(String genero) {
        if (!this.genero.equalsIgnoreCase(genero)) {
            this.genero += "/"+genero;
        }
    }
}
