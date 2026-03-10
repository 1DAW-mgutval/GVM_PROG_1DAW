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
        
        System.out.println("Dime un número de 3 cifras:");
        int num = sc.nextInt();
        
        if (num > 1000 || num < 99) {
            System.out.println("El número debe de ser de 3 cifras");
        } else {
            System.out.println("Unidad: " + (num % 10));
            System.out.println("Decena: " + (num / 10 % 10));
            System.out.println("Centena: " + (num / 100));
        }
    }
    
}
