/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7.pkg4;
import java.util.Scanner;
/**
 *
 * @author 1DAW-mgutval
 */
public class Ejercicio74 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Número con el que operar:");
        int num = sc.nextInt();
        
        long resultado = 1;
        while(num > 0) {
            resultado *= num;
            num--;
        }
        System.out.println("Resultado: "+resultado);
    }
    
}
