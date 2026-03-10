/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;
import java.util.Scanner;
/**
 *
 * @author 1DAW-mgutval
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escribe un primer número entero");
        int num1 = sc.nextInt();
        
        System.out.println("Escribe un segundo número entero");
        int num2 = sc.nextInt();
        
        if (num1 > num2) {
            System.out.println(num1 + " es mayor que " + num2);
        } else if (num2 > num1) {
            System.out.println(num2 + " es mayor que " + num1);
        } else {
            System.out.println("Los números son iguales");
        }
                
    }
    
}
