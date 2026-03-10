/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio8;
import java.util.Scanner;
/**
 *
 * @author 1DAW-mgutval
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float numero;
        
        System.out.println("Dime un número: ");
        numero = sc.nextFloat();
        
        System.out.println("Tu número es: " + numero);
        System.out.println("Tu número al cuadrado es: " + Math.pow(numero, 2));
        System.out.println("Tu número al cubo es: " + Math.pow(numero, 3));
    }
    
}
