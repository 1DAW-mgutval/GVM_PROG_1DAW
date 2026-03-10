/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7.pkg6;
import java.util.Scanner;
/**
 *
 * @author 1DAW-mgutval
 */
public class Ejercicio76 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ancho del triángulo:");
        int ancho = sc.nextInt();
        
        for(int i = ancho; i > 0; i--) {
            for(int j = 1; j <= i; j++) {
                if (i >= j) {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }
    
}
