package ejerciciosclase;

public class Ejercicio_Clase1 {
    public static void main(String[] args) {
        imprimirDescendente(6);
    }

    public static void imprimirDescendente(int n) {
        if (n == 1) {
            System.out.println(n);
        } else {
            System.out.println(n);
            imprimirDescendente(n-1);
        }
    }
}
