import java.util.Date;

public class Libro extends Multimedia{
    protected String autor;
    protected String editorial;
    protected int isbn;
    protected int numPaginas;

    public Libro(String titulo, Date anioEstreno, String autor, String editorial, int isbn, int numPaginas) {
        super(titulo, anioEstreno);
        this.autor = autor;
        this.editorial = editorial;
        this.isbn = isbn;
        this.numPaginas = numPaginas;
    }
}
