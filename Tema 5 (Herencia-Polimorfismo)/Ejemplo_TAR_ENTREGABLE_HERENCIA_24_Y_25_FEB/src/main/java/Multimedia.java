import java.util.Date;

public abstract class Multimedia {
    protected String titulo;
    protected Date anioEstreno;

    public Multimedia(String titulo, Date anioEstreno) {
        this.titulo = titulo;
        this.anioEstreno = anioEstreno;
    }
}
