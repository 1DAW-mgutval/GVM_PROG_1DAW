/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucleanidado1;
import java.util.Scanner;
/**
 *
 * @author 1DAW-mgutval
 */
public class BucleAnidado1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dime un número positivo");
        int num = sc.nextInt();
        
        if (num >= 1) {
            for (int i = num; i > 0; i--) {
                for(int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                }
                System.out.println("");
            }
        } else {
            System.out.println("El número es negativo");
        }
    }
    
}
