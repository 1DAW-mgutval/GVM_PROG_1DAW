package Carnaval;

public class Romancero  extends Agrupacion{



    public Romancero (String nombre, String autor, String autor_musica, String autor_letras, String tipo_disfraz) {
        super(nombre, autor, autor_musica, autor_letras, tipo_disfraz);
    }

    @Override
    String tipoAgrupacion() {
        return "Romancero";
    }
}
