/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejericicio3;
import java.util.Scanner;
/**
 *
 * @author 1DAW-mgutval
 */
public class Ejericicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escribe un número de 3 cifras:");
        int num = sc.nextInt();
        int u, d, c;
        
        if (num < 99 && num > 1000) {
            System.out.println("El número es de más de 3 cifras");
        } else {
            u = num % 100;
            
        }
    }
    
}
