package ejercicios_array;
import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int array[] = rellenaPares(3, 13);

        recorrer_array(array);
    }

    public static int[] rellenaPares(int longitud, int fin) {
        int array[] = new int[longitud];
        int numero = 0;

        for (int i = 0; i < array.length; i++) {

            do {
                numero = (int)(Math.random() * (fin - 2 + 1) + 2);
            } while (numero % 2 == 1);

            array[i] = numero;
        }
        return array;
    }

    public static void recorrer_array (int a[]) {
        for (int i = a.length-1; i >= 0; i--) {
            System.out.println(a[i]);
        }
    }

}
