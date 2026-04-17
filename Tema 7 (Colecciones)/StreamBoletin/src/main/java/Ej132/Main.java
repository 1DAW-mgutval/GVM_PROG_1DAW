package Ej132;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Joseda");
        Cliente c2 = new Cliente("Hugo");
        Cliente c3 = new Cliente("Jorge");

        List<Cliente> grupo = new ArrayList<>();
        grupo.add(c1);
        grupo.add(c3);
        grupo.add(c2);

        System.out.println(
                ((Saludo<List<Cliente>, List<String>>) lista -> {
                    List<String> saludos = new ArrayList<>();
                    for (Cliente cliente : lista) {
                        saludos.add("Hola a " + cliente.nombre);
                    }
                    return saludos;
                }).saludar(grupo)
        );
    }
}
