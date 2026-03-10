/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;
import java.util.Scanner;
/**
 *
 * @author 1DAW-mgutval
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Día actual:");
        int dia = sc.nextInt();
        
        System.out.println("Mes actual:");
        int mes = sc.nextInt();
        int total_dias = 0;
        
        for(int i = 1; i < mes; i++) {
            total_dias += 30;
        }
        
        System.out.println("Quedan " + (360 - (total_dias + dia)) + " días para terminar el año");
    }
    
}
