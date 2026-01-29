package Ej11;

public class Main {
    public static void main(String[] args) {
        Lista lista = new Lista();
        lista.insertarPrincipio(47);
        lista.insertarFinal(12);
        lista.insertarLista(lista);
    }
}
