/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9;
import java.util.Scanner;
/**
 *
 * @author 1DAW-mgutval
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dime números positivos, si quiere terminar introduzca uno negativo");
        int num = 0;
        int media = 0;
        int contador = 0;
        
        while (num >= 0) {
            System.out.print("Número: ");
            num = sc.nextInt();
            if (num >= 0) {
                contador++;
                media += num;
            }
        }
        System.out.println("La media de los números introducidos es: " + (media / contador));
    }
    
}
