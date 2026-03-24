import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> lista = new ArrayList<Integer>();
        int num;
        do {
            System.out.println("Número: ");
            num = sc.nextInt();
            if (num>-1) lista.add(num);
        } while (num != -1);
        sc.close();

        System.out.println("\nEsta es la colección:\n"+lista+"\n");

        System.out.println("Números pares:");
        for (Integer numero : lista) {
            if (numero % 2 == 0) System.out.print(numero + ",");
        }

        for (int i = lista.size()-1; i > -1; i--) {
            if (lista.get(i) % 3 == 0) lista.remove(i);
        }
        System.out.println("\nLista sin números múltiplos de 3:\n"+lista);
    }
}
