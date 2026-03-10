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
        
        System.out.println("Dime un número:");
        int num1 = sc.nextInt();
        
        System.out.println("Dime un número:");
        int num2 = sc.nextInt();
        
        System.out.println("Dime un número:");
        int num3 = sc.nextInt();
        
        if (num1 + num2 == num3) {
            System.out.println(num1 + " + " + num2 + " = " + num3);
        } else if (num2 + num3 == num1) {
            System.out.println(num2 + " + " + num3 + " = " + num1);
        } else if (num1 + num3 == num2) {
            System.out.println(num1 + " + " + num3 + " = " + num2);
        } else {
            System.out.println("Ningún número es la suma de los otros dos");
        }
    }
    
}
