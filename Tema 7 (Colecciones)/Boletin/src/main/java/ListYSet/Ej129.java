package ListYSet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Ej129 {
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

        System.out.println("\níndices par:\n");
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i)%2==0) {
                System.out.print("|"+i);
                lista.set(i, lista.get(i)*100);
            }
        }
        System.out.println("\n"+lista);
    }
}
