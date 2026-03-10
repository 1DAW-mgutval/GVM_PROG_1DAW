/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;
import java.util.Scanner;
/**
 *
 * @author 1DAW-mgutval
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dime un número entero");
        int num1 = sc.nextInt();
        
        System.out.println("Dime otro número entero");
        int num2 = sc.nextInt();
        
        if (num1 % num2 == 0) {
            System.out.println(num1 + " es múltiplo de " + num2);
        } else if (num2 % num1 == 0) {
            System.out.println(num2 + " es múltiplo de " + num1);
        } else {
            System.out.println("Ningún número es múltiplo del otro");
        }
    }
    
}
