package Ej11;

import java.util.Arrays;

public class Lista {
    private Integer[] listaEnteros;

    public Lista () {
        this.listaEnteros = new Integer[0];
    }

    public int numElementos() {
        return this.listaEnteros.length;
    }

    public void insertarFinal(Integer num) {
        this.listaEnteros = Arrays.copyOf(this.listaEnteros, this.numElementos()+1);
        this.listaEnteros[this.numElementos()-1] = num;
    }

    public void insertarPrincipio(Integer num) {
        this.listaEnteros = Arrays.copyOf(this.listaEnteros, this.numElementos()+1);
        for (int i = this.numElementos()-1; i > 0 ; i--) {
            this.listaEnteros[i] = this.listaEnteros[i-1];
        }
        this.listaEnteros[0] = num;
    }

    public void insertarIndice(Integer num, int indice) {
        if (indice <= 0) {
            this.insertarPrincipio(num);
        } else if (indice == this.numElementos()-1 || indice > this.numElementos()-1) {
            this.insertarFinal(num);
        } else {
            Integer[] temp = Arrays.copyOf(this.listaEnteros, this.numElementos());
            this.listaEnteros = Arrays.copyOf(this.listaEnteros, this.numElementos()+1);
            for (int i = 0; i < this.numElementos(); i++) {
                for (int j = 0; j < temp.length; j++) {
                    if (i == indice) {
                        this.listaEnteros[i] = num;
                    } else {
                        this.listaEnteros[i] = temp[j];
                    }
                }
            }
        }
    }

    public void insertarLista(Lista listaNueva) {
        int max = listaNueva.numElementos();
        for (int i = 0; max > 0 && i < max ; i++) {
            this.insertarFinal(listaNueva.getListaEnteros()[i]);
        }
    }

    public boolean eliminarIndice (int indice) {
        boolean resultado = false;
        if (indice > -1 && indice < this.numElementos()) {
            Integer[] temp = Arrays.copyOf(this.listaEnteros, this.numElementos());
            int indiceTemp = 0;
            this.listaEnteros = Arrays.copyOf(this.listaEnteros, this.numElementos() - 1);
            for (int i = 0; i < this.numElementos(); i++) {
                if (i != indice) {
                    this.listaEnteros[i] = temp[indiceTemp];
                }
                indiceTemp++;
            }
            resultado = true;
        }
        return resultado;
    }

    public Integer[] getListaEnteros() {
        return listaEnteros;
    }
}
