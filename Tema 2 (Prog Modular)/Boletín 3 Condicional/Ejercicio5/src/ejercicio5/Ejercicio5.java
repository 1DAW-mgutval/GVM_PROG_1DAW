/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;
import java.util.Scanner;
/**
 *
 * @author 1DAW-mgutval
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dime un caracter");
        char c1 = sc.next().charAt(0);
        
        System.out.println("Dime un caracter");
        char c2 = sc.next().charAt(0);
        
        System.out.println("Dime un caracter");
        char c3 = sc.next().charAt(0);
        
        if (c1 > c2 && c1 > c3) {
            if (c2 > c3) {
                System.out.println("El orden de los caracteres es: " + c1 + ", " + c2 + ", " + c3);
            } else {
                System.out.println("El orden de los caracteres es: " + c1 + ", " + c3 + ", " + c2);
            }
        } else if (c2 > c3) {
            if (c3 > c1) {
                System.out.println("El orden de los caracteres es: " + c2 + ", " + c3 + ", " + c1);
            } else {
                System.out.println("El orden de los caracteres es: " + c2 + ", " + c1 + ", " + c3);
            }
        } else {
            if (c2 > c1) {
                System.out.println("El orden de los caracteres es: " + c3 + ", " + c2 + ", " + c1);
            } else {
                System.out.println("El orden de los caracteres es: " + c3 + ", " + c1 + ", " + c2);
            }
        }
    }
    
}
