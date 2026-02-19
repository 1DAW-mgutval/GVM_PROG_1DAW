package Carnaval;

public class Romancero  extends Agrupacion{

    private String tematica;

    public Romancero (String nombre, String autor, String autor_musica, String autor_letras, String tipo_disfraz, String tematica) {
        super(nombre, autor, autor_musica, autor_letras, tipo_disfraz);
        this.tematica = tematica;
    }

    @Override
    String tipoAgrupacion() {
        return "Romancero";
    }
}
