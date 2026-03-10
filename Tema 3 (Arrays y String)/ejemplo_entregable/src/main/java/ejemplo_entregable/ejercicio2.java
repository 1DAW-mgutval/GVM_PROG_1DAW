package ejemplo_entregable;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int ocupacionMesas[] = new int[10];
        ocupacionAleatorias(ocupacionMesas);

        boolean continuar = true;
        int comensales, mesaLibre;
        while (continuar) {
            pintarMesas(ocupacionMesas);
            System.out.println("\n¿Cuántos son? (Introduzca -1 para salir del programa)");
            comensales = sc.nextInt();
            mesaLibre = calcularMesa(ocupacionMesas, comensales);
            if (comensales == -1) {
                System.out.println("Gracias, hasta pronto.");
                continuar = false;
            } else if (mesaLibre == -2) {
                System.out.println("Lo siento, en este momento no queda sitio.");
            } else if (ocupacionMesas[mesaLibre] == 0) {
                System.out.println("Por favor, siéntese en la mesa número "+(mesaLibre+1));
                ocupacionMesas[mesaLibre] = comensales;
            } else {
                System.out.println("Tendrá que compartir mesa. Por favor, siéntese en la mesa número "+(mesaLibre+1));
                ocupacionMesas[mesaLibre] += comensales;
            }
        }

    }

    public static void pintarMesas (int [] ocupacionMesas) {
        System.out.print("Mesa Nº   ");
        for (int i = 1; i <= ocupacionMesas.length; i++) {
            System.out.print("| " + i + " |");
        }

        System.out.print("\nOcupación ");
        for (int i : ocupacionMesas) {
            System.out.print("| " + i + " |");
        }
    }

    public static int calcularMesa (int[] ocupacionMesa, int comensales) {
        for (int i = 0; i < ocupacionMesa.length; i++) {
            if (ocupacionMesa[i] == 0) {
                return i;
            }
        }
        for (int i = 0; i < ocupacionMesa.length; i++) {
            if (ocupacionMesa[i] <= 4-comensales) {
                return i;
            }
        }
        return -2;
    }

    public static void ocupacionAleatorias (int[] ocupacionMesas) {
        for (int i = 0; i < ocupacionMesas.length; i++) {
            ocupacionMesas[i] = (int)(Math.random() * 5);
        }
    }
}
