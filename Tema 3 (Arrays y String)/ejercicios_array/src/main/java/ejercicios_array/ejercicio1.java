package ejercicios_array;

public class ejercicio1 {
    public static void main(String[] args) {

        int aleatorios[] = new int[10];
        for (int i = 0; i < 10; i++) {
            aleatorios[i] = (int)(Math.random()*100+1);
            System.out.println("Número " + i + " es el siguiente: " + aleatorios[i]);
        }

        System.out.println("Suma de los números aleatorios");
        System.out.println("La suma de los números es: " + suma_array(aleatorios, 9));
    }

    public static int suma_array (int a[], int b) {
        if (b == 0) {
            return a[0];
        } else {
            return a[b] + suma_array(a, b-1);
        }
    }
}