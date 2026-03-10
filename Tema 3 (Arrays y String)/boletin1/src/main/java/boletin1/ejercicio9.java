package boletin1;

public class ejercicio9 {
    public static void main(String[] args) {
        divisoresPrimos(100);
    }

    public static boolean esPrimo (int num) {
        boolean primo = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                primo = false;
            }
        }
        return primo;
    }

    public static void divisoresPrimos (int num) {
        int divisores = 1;
        for (int i = 2; i <= num; i++) {
            if (num % i == 0 && esPrimo(i)) {
                System.out.println(i);
            }
        }
    }
}
