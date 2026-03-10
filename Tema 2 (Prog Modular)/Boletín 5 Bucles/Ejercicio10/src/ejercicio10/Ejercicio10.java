/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10;
import java.util.Scanner;
/**
 *
 * @author 1DAW-mgutval
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escriba números, para terminar, introduzca 0");
        int num = 1;
        
        while (!(num == 0)) {
            System.out.print("Número: ");
            num = sc.nextInt();
            if (num % 2 == 0 && !(num == 0)) {
                System.out.println("El número es par");
            } else if (num % 2 == 1) {
                System.out.println("El número es impar");
            }
        }
        System.out.println("Fin del programa");
    }
    
}
