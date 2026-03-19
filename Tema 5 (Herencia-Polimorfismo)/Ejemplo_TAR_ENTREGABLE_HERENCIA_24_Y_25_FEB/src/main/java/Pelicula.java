import java.util.Date;

public class Pelicula extends Multimedia{
    protected String director;
    protected double duracion;
    protected String productora;
    protected String pais;

    public Pelicula(String titulo, Date anioEstreno, String director, double duracion, String productora, String pais) {
        super(titulo, anioEstreno);
        this.director = director;
        this.duracion = duracion;
        this.productora = productora;
        this.pais = pais;
    }
}
