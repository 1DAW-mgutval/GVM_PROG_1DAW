/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6;
import java.util.Scanner;
/**
 *
 * @author 1DAW-mgutval
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        char c1, c2, c3, c4, c5;
        
        System.out.println("Dime un caracter: ");
        c1 = sc.next().charAt(0);
        
        System.out.println("Dime un caracter: ");
        c2 = sc.next().charAt(0);
        
        System.out.println("Dime un caracter: ");
        c3 = sc.next().charAt(0);
        
        System.out.println("Dime un caracter: ");
        c4 = sc.next().charAt(0);
        
        System.out.println("Dime un caracter: ");
        c5 = sc.next().charAt(0);
        
        System.out.println("Los caracteres al revés son: " + c5 + "," + c4 + "," + c3 + "," + c2 + "," + c1 + ",");
    }
    
}
