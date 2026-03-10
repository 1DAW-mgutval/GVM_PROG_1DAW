/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;
import java.util.Scanner;
/**
 *
 * @author 1DAW-mgutval
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dime un número");
        int num = sc.nextInt();
        
        if (num > 0) {
            System.out.println("Estos son los números desde 0 hasta " + num);
            for (int i = 0; i <= num; i++) {
            System.out.println(i);
            }
        } else {
            System.out.println("El número debe ser positivo");
        }
    }
    
}
