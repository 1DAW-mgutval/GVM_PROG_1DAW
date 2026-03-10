/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;
import java.util.Scanner;
/**
 *
 * @author mrzan
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3;
        
        System.out.println("Escribe un número: ");
        num1 = sc.nextInt();
        
        System.out.println("Escribe un número: ");
        num2 = sc.nextInt();
        
        System.out.println("Escribe un número: ");
        num3 = sc.nextInt();
        
        if (num1 > num2 && num1 > num3) {
                System.out.println("El número mayor entre " + num1 + ", " + num2 + " y " + num3 + " es " + num1);
        } else if (num2 > num3) {
                System.out.println("El número mayor entre " + num1 + ", " + num2 + " y " + num3 + " es " + num2);
        } else {
                 System.out.println("El número mayor entre " + num1 + ", " + num2 + " y " + num3 + " es " + num3);           
        }
    }
    
}
