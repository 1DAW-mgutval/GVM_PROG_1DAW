package Carnaval;

public class Comparsa extends AgrupacionOficial{

    private String empresaAtrezzo;

    public Comparsa (String nombre, String autor, String autor_musica, String autor_letras, String tipo_disfraz, String empresaAtrezzo) {
        super(nombre, autor, autor_musica, autor_letras, tipo_disfraz);
        this.empresaAtrezzo = empresaAtrezzo;
    }

    @Override
    String tipoAgrupacion() {
        return "Comparsa";
    }
}
