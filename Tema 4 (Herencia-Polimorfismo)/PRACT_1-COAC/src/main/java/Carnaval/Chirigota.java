package Carnaval;

public class Chirigota extends AgrupacionOficial implements Callejera {

    private int cuples_no;

    public Chirigota (String nombre, String autor, String autor_musica, String autor_letras, String tipo_disfraz, int cuples_no) {
        super(nombre, autor, autor_musica, autor_letras, tipo_disfraz);
        this.cuples_no = cuples_no;
    }

    public int getCuples_no() {
        return cuples_no;
    }

    @Override
    String tipoAgrupacion() {
        return "Chirigota";
    }

    @Override
    public void amo_a_escucha() {
        System.out.println("Amo a escucha la Chirigota "+nombre);
    }
}
