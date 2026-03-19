import java.util.Arrays;
import java.util.Date;

public class Serie extends Multimedia{
    protected String creador;
    protected int numTemporadas;
    protected String[] capitulos;

    public Serie(String titulo, Date anioEstreno, String creador, int numTemporadas, String[] capitulos) {
        super(titulo, anioEstreno);
        this.creador = creador;
        this.numTemporadas = numTemporadas;
        this.capitulos = capitulos;
    }

    public Serie(String titulo, Date anioEstreno, String creador, int numTemporadas) {
        this(titulo, anioEstreno, creador, numTemporadas, new String[0]);
    }

    public void add_capitulo(String capitulo){

    }

    public boolean eliminar_capitulo(String capitulo){
        boolean res = false;

        String[] nuevo = new String[0];
        for (int i = 0; i < capitulo.length(); i++) {
            if (!capitulo.equals(this.capitulos[i])) {
                nuevo = Arrays.copyOf(nuevo, nuevo.length+1);
                nuevo[nuevo.length-1] = this.capitulos[i];
            }
        }

        return res;
    }

}
