package boletin1;

public class ejercicio11 {
    public static void main(String[] args) {
        System.out.println(potencia_recursiva(2, 6));
    }

    public static double potencia_iterativa (double a, int n) {
        double resultado = 1;
        if (n<0) {
            resultado = -1;
        }
        while (n>0) {
            resultado *= a;
            n--;
        }
        return resultado;
    }

    public static double potencia_recursiva (double a, int n) {
        if (n == 0) {
            return 1.0;
        } else {
            return a * potencia_recursiva(a, n -1); 
        }
    }
}
