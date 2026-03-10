/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7.pkg7;
import java.util.Scanner;
/**
 *
 * @author 1DAW-mgutval
 */
public class Ejercicio77 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Número a elegir: ");
        int num = sc.nextInt();
        
        while (num > 1) {
            int contador = 2, divisor = 0;
            while(contador < num) {
                if (num % contador == 0) {
                    divisor++;
                }
                contador++;
            }
            if (divisor > 0) {
                System.out.println(num+"-> no primo");
            } else {
                System.out.println(num+"-> primo");
            }
            num--;
        }
    }
    
}
