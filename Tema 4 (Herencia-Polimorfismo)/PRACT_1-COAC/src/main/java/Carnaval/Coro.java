package Carnaval;

public class Coro extends AgrupacionOficial{

    private int bandurrias_no;
    private int guitarras_no;

    public Coro (String nombre, String autor, String autor_musica, String autor_letras, String tipo_disfraz, int bandurrias_no, int guitarras_no) {
        super(nombre, autor, autor_musica, autor_letras, tipo_disfraz);
        this.bandurrias_no = bandurrias_no;
        this.guitarras_no = guitarras_no;
    }

    @Override
    String tipoAgrupacion() {
        return "Coro";
    }
}
