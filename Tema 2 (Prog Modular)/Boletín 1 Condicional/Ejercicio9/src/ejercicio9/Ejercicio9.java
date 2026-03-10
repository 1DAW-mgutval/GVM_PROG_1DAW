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
        float numero;
        
        System.out.println("Escribe un número: ");
        numero = sc.nextFloat();
        
        System.out.println("Tu número es: " + numero);
        System.out.println("Tu número + 1 es: " + ( ++ numero));
        System.out.println("Tu número + 2 es: " + (numero += 2));
    }
    
}
