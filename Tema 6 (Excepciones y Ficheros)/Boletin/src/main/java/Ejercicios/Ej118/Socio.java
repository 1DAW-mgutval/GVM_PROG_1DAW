package Ejercicios.Ej118;

import java.io.Serializable;

public class Socio implements Serializable {

    public static int numSocios = 0;
    private int num;

    public Socio (){
        numSocios++;
        num = numSocios;
    }

    @Override
    public String toString() {
        return "Socio Nº"+num;
    }
}
