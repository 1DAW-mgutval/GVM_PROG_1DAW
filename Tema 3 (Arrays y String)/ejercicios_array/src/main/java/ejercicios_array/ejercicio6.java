package ejercicios_array;

public class ejercicio6 {
    public static void main(String[] args) {
        
        int premio[] = {4,7,0,6,3,8};
        int primitiva[] = {9,4,7,2,3,5};

        System.out.println(aciertos(premio, primitiva));
    }

    public static int aciertos (int a[], int b[]) {
        int contador = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    contador++;
                }
            }
        }
        return contador;
    }
}
