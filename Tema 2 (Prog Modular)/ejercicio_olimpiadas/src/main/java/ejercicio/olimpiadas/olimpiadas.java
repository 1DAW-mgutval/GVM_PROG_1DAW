package ejercicio.olimpiadas;
import java.util.Scanner;

public class olimpiadas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t;
        System.out.println("Número de casos:");
        do {
            t = sc.nextInt();
            if (t < 1 || t > 100000) {
                System.out.println("ERROR. El número de casos no es válido, vuelva a intentarlo.");
            }
        } while (t < 1 || t > 100000) ;

        int f, a, n, division;
        while (t > 0) {
            System.out.println("Escriba número de filas, número de asientos por fila y el número de asiento a consultar (en ese orden).");
            f = sc.nextInt(); a = sc.nextInt(); n = sc.nextInt();
            
            division = n / a;

            for(int i = 1; i <= f; i++){
                for(int j = 1; j <= a; j++ ) {
                   if (j == 1 || j == a) {
                    if (division % 2 == 0) {
                        System.out.println("VENTANA");
                    } else if (division % 2 == 1) {
                        System.out.println("PASILLO");
                    }
                   }  else {
                    System.out.println(":(");
                   }



                   

                }
            }
            t--;
        }
    }
}
