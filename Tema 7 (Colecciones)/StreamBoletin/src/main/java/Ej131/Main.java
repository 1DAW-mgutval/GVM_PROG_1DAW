package Ej131;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        String nombre = "Joseda";
        Saludo<String> sNombre = saludo -> out.println("Hola "+saludo);
        sNombre.saludar(nombre);

        Cliente cliente = new Cliente("Hugo Jefe Boss");
        Saludo<Cliente> sCliente = saludo -> out.println("HOLA cliente "+saludo);
        sCliente.saludar(cliente);
    }
}
