package Carnaval;

import java.util.Arrays;

public abstract class AgrupacionOficial extends Agrupacion {
    protected int puntos_obtenidos;
    protected Integrante[] lista_integrantes;

    public AgrupacionOficial (String nombre, String autor, String autor_musica, String autor_letras, String tipo_disfraz) {
        super(nombre, autor, autor_musica, autor_letras, tipo_disfraz);
        this.puntos_obtenidos = 0;
        this.lista_integrantes = new Integrante[0];
    }

    abstract String tipoAgrupacion();

    public void incrementar_puntos(int puntos) {
        if (puntos > 0) {
            this.puntos_obtenidos += puntos;
        } else {
            System.out.println("No se pueden sumar "+puntos+" puntos");
        }
    }

    private boolean existeIntegrante (Integrante i) {
        boolean existe = false;

        for (int j = 0; j < this.lista_integrantes.length && !existe; j++) {
            if (i.equals(this.lista_integrantes[j])) {
                existe = true;
            }
        }

        return existe;
    }

    public void insertar_integrante(Integrante i){
        if (!existeIntegrante(i)) {
            Arrays.copyOf(this.lista_integrantes, (this.lista_integrantes.length+1));
            this.lista_integrantes[this.lista_integrantes.length-1] = i;
        } else {
            System.out.println("[ERROR] El integrante ya está en la lista.");
        }
    }

    public boolean eliminar_integrante(Integrante i) {
        boolean exitoso = false;
        if (existeIntegrante(i)) {
            Integrante[] listaNueva = new Integrante[this.lista_integrantes.length-1];
            int indiceNuevo = 0;
            for (int j = 0; j < this.lista_integrantes.length; j++) {
                if (!i.equals(this.lista_integrantes[j])) {
                    listaNueva[indiceNuevo] = this.lista_integrantes[j];
                    indiceNuevo++;
                }
            }
            this.lista_integrantes = listaNueva;
            exitoso = true;
        }
        return exitoso;
    }

    public void caminito_del_falla() {

    }
}
