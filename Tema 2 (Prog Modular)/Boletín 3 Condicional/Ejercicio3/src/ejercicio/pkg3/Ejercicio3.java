/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg3;
import java.util.Scanner;
/**
 *
 * @author 1DAW-mgutval
 */
public class Ejercicio3 {

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
            System.out.println("El primer número es múltiplo del segundo");
        } else {
            System.out.println("El primer número no es múltiplo del segundo");
        }
    }
    
}
