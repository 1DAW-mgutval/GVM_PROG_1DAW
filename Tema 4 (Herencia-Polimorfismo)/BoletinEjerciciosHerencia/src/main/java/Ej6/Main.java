package Ej6;

public class Main {
    public static void main(String[] args) {
        Caja c = new Caja(120,320,120,Unidades.cm);
        System.out.println(c.toString());

        Etiqueta etiqueta = new Etiqueta("Joseda", "Morisco Nº 25", 12,32,12,Unidades.m);
        System.out.println(etiqueta.toString());
    }
}
