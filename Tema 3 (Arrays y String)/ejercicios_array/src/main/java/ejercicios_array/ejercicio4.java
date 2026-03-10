package ejercicios_array;

public class ejercicio4 {
    public static void main(String[] args) {
        int tabla[] = {4, 8, 10, 34, 12, 3};

        System.out.println("Número máximo: " + maximo(tabla));
    }

    public static int maximo (int a[]) {
        int maximo = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > maximo) {
                maximo = a[i];
            }
        }
        return maximo;
    }

}
