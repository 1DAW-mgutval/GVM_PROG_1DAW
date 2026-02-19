package Carnaval;

import java.util.Arrays;

public class COAC{
    protected AgrupacionOficial[] lista_agrupaciones;

    public COAC() {
        this.lista_agrupaciones = new AgrupacionOficial[0];
    }

    public void inscribir_agrupacion(AgrupacionOficial agrupacion) {
        if (!existeAgrupacion(agrupacion)) {
            this.lista_agrupaciones = Arrays.copyOf(this.lista_agrupaciones, this.lista_agrupaciones.length+1);
            this.lista_agrupaciones[this.lista_agrupaciones.length-1] = agrupacion;
        }
    }

    public boolean eliminar_agrupacion(AgrupacionOficial agrupacion) {
        boolean exitoso = false;
        if (existeAgrupacion(agrupacion)) {
            exitoso = true;
            AgrupacionOficial[] nuevaLista = new AgrupacionOficial[this.lista_agrupaciones.length-1];
            int indiceNuevaLista = 0;
            for (int i = 0; i < lista_agrupaciones.length; i++) {
                if (!agrupacion.equals(lista_agrupaciones[i])) {
                    nuevaLista[indiceNuevaLista] = this.lista_agrupaciones[i];
                    indiceNuevaLista++;
                }
            }
            this.lista_agrupaciones = nuevaLista;
        }
        return exitoso;
    }

    private boolean existeAgrupacion (AgrupacionOficial nueva) {
        boolean existe = false;

        for (int i = 0; i < this.lista_agrupaciones.length && !existe; i++) {
            if (nueva.equals(this.lista_agrupaciones[i])) {
                existe = true;
            }
        }

        return existe;
    }
}
