package Ej4_5;

import java.util.Arrays;

public class Piano extends Instrumento {

    public Piano() {
        super();
    }

    @Override
    public void interpretar() {
        if (this.listaNotas.length == 0) {
            System.out.println("No hay ninguna nota disponible");
        } else {
            System.out.println("Las notas para el piano son: "+ Arrays.toString(this.listaNotas));
        }
    }
}
