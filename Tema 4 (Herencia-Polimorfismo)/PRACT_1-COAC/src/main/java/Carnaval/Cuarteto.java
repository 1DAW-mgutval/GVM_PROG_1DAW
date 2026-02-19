package Carnaval;

public class Cuarteto extends AgrupacionOficial{

    private int miembros_no;

    public Cuarteto (String nombre, String autor, String autor_musica, String autor_letras, String tipo_disfraz) {
        super(nombre, autor, autor_musica, autor_letras, tipo_disfraz);
        miembros_no = super.lista_integrantes.length;
    }

    @Override
    String tipoAgrupacion() {
        return "Cuarteto";
    }

    public int getMiembros_no() {
        return miembros_no;
    }

    @Override
    public void insertar_integrante(Integrante i) {
        int miembrosAnteriores = super.lista_integrantes.length;
        super.insertar_integrante(i);
        if (miembrosAnteriores < super.lista_integrantes.length) {
            this.miembros_no++;
        }
    }

    @Override
    public boolean eliminar_integrante(Integrante i) {
        boolean exitoso = false;
        if (super.eliminar_integrante(i)) {
            exitoso = true;
            this.miembros_no--;
        }
        return exitoso;
    }
}
