package boletin1;

public class ejercicio5 {
    public static void main(String[] args) {
        System.out.println(mayor(2, 7, 12));
    }


    public static int mayor (int a, int b, int c) {
        int mayor = a;
        if (b > mayor) {
            mayor = b; 
        } if (c > mayor) {
            mayor = c;
        }
        return mayor;
    }
}
