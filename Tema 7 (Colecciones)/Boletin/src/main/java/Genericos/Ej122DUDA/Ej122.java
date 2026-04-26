package Genericos.Ej122DUDA;

public class Ej122 {
    public static void main(String[] args) {
        Contenedor<String> contenedor = new Contenedor<>();

        contenedor.insertarAlFinal("HOLA");
        System.out.println(contenedor.toString());
        contenedor.insertarAlFinal("FINAL");
        System.out.println(contenedor.toString());
        contenedor.insertarAlPrincipio("PRINCIPIO");
        System.out.println(contenedor.toString());
        System.out.println(contenedor.extraerDelFinal());
        System.out.println(contenedor.extraerDelPrincipio());
        contenedor.ordenar();
        System.out.println(contenedor.toString());
    }
}
