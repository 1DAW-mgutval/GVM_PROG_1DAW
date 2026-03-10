/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucle5;
import java.util.Scanner;
/**
 *
 * @author 1DAW-mgutval
 */
public class Bucle5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dime un número entero");
        int num = sc.nextInt();
        int divisiones = 2;
        boolean primo = true;
        
        while (divisiones < num && primo == true) {
            if (num % divisiones == 0) {
                primo = false;
            }
            divisiones++;
        }
        if (primo == false) {
            System.out.println("El número no es primo");
        } else {
            System.out.println("El número es primo");
        }
    }
    
}
