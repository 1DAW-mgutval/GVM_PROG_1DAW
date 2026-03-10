/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejericio1;
import java.util.Scanner;
/**
 *
 * @author 1DAW-mgutval
 */
public class Ejericio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escribe un número real");
        float numero = sc.nextFloat();
        
        if (numero > 0) {
            System.out.println("El número es positivo");
        } else if (numero == 0) {
            System.out.println("El número es 0");
        } else {
            System.out.println("El número es negativo");
        }
        
    }
    
}
