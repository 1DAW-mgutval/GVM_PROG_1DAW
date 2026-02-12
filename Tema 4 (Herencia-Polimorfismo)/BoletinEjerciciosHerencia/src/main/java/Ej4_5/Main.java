package Ej4_5;

public class Main {
    public static void main(String[] args) {
        Instrumento piano = new Piano();
        piano.interpretar();

        Notas[] notasNuevas = {Notas.MI,Notas.RE,Notas.SOL};
        piano.add(notasNuevas);
        piano.interpretar();
    }
}
