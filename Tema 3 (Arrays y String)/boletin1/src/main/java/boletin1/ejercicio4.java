package boletin1;
public class ejercicio4 {
    public static void main(String[] args) {
        int num = num_mayor(8, 2);
        System.out.println(num);
    }
    public static int num_mayor (int a, int b) {
        int mayor = a;
        if (b > mayor) {
            mayor = b; 
        }
        return mayor;
    }
}