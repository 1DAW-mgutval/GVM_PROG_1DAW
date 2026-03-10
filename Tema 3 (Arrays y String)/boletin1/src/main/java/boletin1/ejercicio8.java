package boletin1;

public class ejercicio8 {
    public static void main(String[] args) {
        System.out.println(numPrimos(100));
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

    public static int numPrimos (int num) {
        int divisores = 1;
        for (int i = 2; i <= num; i++) {
            if (num % i == 0 && esPrimo(i)) {
                divisores++;
            }
        }
        return divisores;
    }
}
