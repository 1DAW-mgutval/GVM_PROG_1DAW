package Carnaval;

public class Cuarteto extends AgrupacionOficial{



    public Cuarteto (String nombre, String autor, String autor_musica, String autor_letras, String tipo_disfraz) {
        super(nombre, autor, autor_musica, autor_letras, tipo_disfraz);
    }

    @Override
    String tipoAgrupacion() {
        return "Cuarteto";
    }
}
