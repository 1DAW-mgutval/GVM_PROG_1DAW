/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucleanidado5;
import java.util.Scanner;
/**
 *
 * @author 1DAW-mgutval
 */
public class BucleAnidado5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Tabla inicial:");
        int i = sc.nextInt();
        System.out.println("Tabla final:");
        int f = sc.nextInt();
        
        while (i <= f) {
            for (int j = 0; j < 11; j++) {
                System.out.print((i * j) + " ");
            }
            System.out.println(" ");
            i++;
        }
    }
    
}
