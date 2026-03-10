package boletin1;

public class ejercicio6 {
    public static void main(String[] args) {
        System.out.println(esVocal('r'));
    }


    public static boolean esVocal (char a) {
        boolean vocal = false;
        if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u') {
            vocal = true;
        }
        return vocal;
    }
}
