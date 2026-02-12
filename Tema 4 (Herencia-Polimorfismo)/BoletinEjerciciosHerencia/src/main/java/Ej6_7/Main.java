package Ej6_7;

public class Main {
    public static void main(String[] args) {
//        Comprobación Ejercicio 6
        Caja c = new Caja(120,320,120,Unidades.cm);
        c.setEtiqueta("Dirección: Calle Morisco. Remitente: Joseda");
        System.out.println(c.toString());

//        Comprobación Ejercicio 7
        CajaCarton carton = new CajaCarton(120,320,120,12345);
        System.out.println(carton.toString());
        System.out.println(carton.etiqueta);
        System.out.println(carton.getVolumen());
        System.out.println(carton.getSuperficie());
    }
}
