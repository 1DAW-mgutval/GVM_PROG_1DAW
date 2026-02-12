package Ej4_5;

import java.util.Arrays;

public abstract class Instrumento {
    protected Notas[] listaNotas;

    public Instrumento() {
        this.listaNotas = new Notas[0];
    }

    public void add(Notas[] nuevasNotas){
        this.listaNotas = Arrays.copyOf(this.listaNotas, this.listaNotas.length+nuevasNotas.length);
        int contador = 0;
        for (int i = 0; i < this.listaNotas.length; i++) {
            if (this.listaNotas[i] == null) {
                this.listaNotas[i] = nuevasNotas[contador];
                contador++;
            }
        }
    }

    public abstract void interpretar();
}
