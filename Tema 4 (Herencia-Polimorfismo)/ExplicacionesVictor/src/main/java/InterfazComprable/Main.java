package InterfazComprable;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Coche[] listaCoches = new Coche[3];
        listaCoches[0] = new Coche("12345J",2006);
        listaCoches[1] = new Coche("12345M",2022);
        listaCoches[2] = new Coche("12345H",1999);
        Arrays.sort(listaCoches);
    }
}
