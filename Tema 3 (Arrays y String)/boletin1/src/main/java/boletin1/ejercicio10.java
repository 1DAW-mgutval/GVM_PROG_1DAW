package boletin1;

public class ejercicio10 {
    public static void main(String[] args) {
        boolean resultado = sonAmigos(220, 284);
        System.out.println(resultado);
    }

    public static boolean sonAmigos (int num1, int num2) {
        boolean resultado = false;
        int divisor1 = 1;
        int divisor2 = 1;
        int divisor = 2;
        int mayor = num2;
        if (num1 > num2) {
            mayor = num1;
        }
        while (divisor < mayor) {
            if (num1 % divisor == 0 && num1 > divisor) {
                divisor1 += divisor;
            }
            if (num2 % divisor == 0 && num2 > divisor) {
                divisor2 += divisor;
            }
            divisor++;
        }
        if (divisor1 == num2 && divisor2 == num1) {
            resultado = true;
        }
        return resultado;
    }
}