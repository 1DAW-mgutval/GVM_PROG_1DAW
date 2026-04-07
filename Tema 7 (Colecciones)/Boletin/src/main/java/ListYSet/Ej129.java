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

        Iterator iterator = lista.iterator();
        while (iterator.hasNext()) {
            if ((int)iterator.next()%2==0) {
                System.out.println(lista);
            }
        }
    }
}
