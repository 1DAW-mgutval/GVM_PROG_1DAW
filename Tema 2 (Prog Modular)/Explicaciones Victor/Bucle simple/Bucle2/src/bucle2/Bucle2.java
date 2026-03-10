/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucle2;
import java.util.Scanner;
/**
 *
 * @author 1DAW-mgutval
 */
public class Bucle2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num = 1;
        while (num % 2 != 0){
            System.out.println("Dime un número");
            num = sc.nextInt();
        }
        System.out.println("El número introducido es par");
    }
    
}
