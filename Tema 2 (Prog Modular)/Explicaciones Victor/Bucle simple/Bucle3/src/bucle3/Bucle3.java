/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucle3;
import java.util.Scanner;
/**
 *
 * @author 1DAW-mgutval
 */
public class Bucle3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num = 1;
        do {
            System.out.println("Dime un número par");
            num = sc.nextInt();
        } while (num % 2 != 0);
    }
    
}
