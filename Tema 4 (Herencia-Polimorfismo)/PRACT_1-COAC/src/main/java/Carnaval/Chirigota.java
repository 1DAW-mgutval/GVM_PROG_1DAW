package Carnaval;

public class Chirigota extends AgrupacionOficial{

    private int cuples_no;

    public Chirigota (String nombre, String autor, String autor_musica, String autor_letras, String tipo_disfraz, int cuples_no) {
        super(nombre, autor, autor_musica, autor_letras, tipo_disfraz);
        this.cuples_no = cuples_no;
    }

    @Override
    String tipoAgrupacion() {
        return "Chirigota";
    }
}
