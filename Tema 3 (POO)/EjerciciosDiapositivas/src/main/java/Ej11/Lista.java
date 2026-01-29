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
        this.listaEnteros = Arrays.copyOf(this.listaEnteros, this.listaEnteros.length+1);
        this.listaEnteros[this.listaEnteros.length-1] = num;
    }

    public void insertarPrincipio(Integer num) {
        this.listaEnteros = Arrays.copyOf(this.listaEnteros, this.listaEnteros.length+1);
        for (int i = this.listaEnteros.length-1; i > 0 ; i--) {
            this.listaEnteros[i] = this.listaEnteros[i-1];
        }
        this.listaEnteros[0] = num;
    }

    public void insertarIndice(Integer num, int indice) {
        if (indice == 0 || indice < 0) {
            this.insertarPrincipio(num);
        } else if (indice == this.listaEnteros.length-1 || indice > this.listaEnteros.length-1) {
            this.insertarFinal(num);
        } else {

        }
    }
}
