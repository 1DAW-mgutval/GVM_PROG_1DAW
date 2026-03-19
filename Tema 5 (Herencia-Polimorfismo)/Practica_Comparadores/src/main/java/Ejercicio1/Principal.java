package Ejercicio1;

import java.util.Arrays;

public class Principal {
    public static void main(String[] args) {
        Coche c1 = new Coche();
        Coche c2 = new Coche();
        Coche c3 = new Coche();
        c3.matricular("6686JWV");
        Coche c4 = new Coche();
        c4.matricular("5434MHN");
        c1.setMarca("Zou");
        c1.setModelo("Ahora");
        c2.setMarca("Zou");
        c2.setModelo("Zorro");
        Coche[] coches = {c1, c2, c3, c4};
        Arrays.sort(coches);

        Moto m1 = new Moto();
        Moto m2 = new Moto();
        Moto m3 = new Moto();
        Moto m4 = new Moto();
        m2.setMarca("Joseda");
        m2.setModelo("Gil");
        m3.setMarca("Jorge");
        m3.setModelo("Fuentes");
        Moto[] motos = {m2,m4,m1,m3};
        Arrays.sort(motos);

        Vehiculo[] vehiculos = {(Vehiculo) m1, (Vehiculo) m4, (Vehiculo) m3, (Vehiculo) m2, (Vehiculo) c3, (Vehiculo) c4, (Vehiculo) c2, (Vehiculo) c1};
        Arrays.sort(vehiculos);
    }
}
