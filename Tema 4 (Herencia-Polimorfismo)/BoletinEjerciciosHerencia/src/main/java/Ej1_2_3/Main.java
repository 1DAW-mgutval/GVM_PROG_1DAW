package Ej1_2_3;

public class Main {
    public static void main(String[] args) {
        Hora h1 = new Hora(23,59);
        System.out.println(h1.toString());
        h1.inc();
        System.out.println(h1.toString());

        HoraExacta exacta1 = new HoraExacta(23,59,59);
        System.out.println(exacta1.toString());
        exacta1.inc();
        System.out.println(exacta1.toString());

        HoraExacta exacta2 = new HoraExacta(0,0,0);
        System.out.println(exacta1.equals(exacta2));
    }
}
