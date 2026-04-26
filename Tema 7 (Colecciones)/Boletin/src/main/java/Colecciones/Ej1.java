package Colecciones;

import java.util.ArrayList;
import java.util.Iterator;
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

        Iterator iterator = lista.iterator();

        while (iterator.hasNext()) {
            if ((int)iterator.next() % 3 == 0) {
                iterator.remove();
            }
        }
        System.out.println("\nLista sin números múltiplos de 3:\n"+lista);
    }
}
