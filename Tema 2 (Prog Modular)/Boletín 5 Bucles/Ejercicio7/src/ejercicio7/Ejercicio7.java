/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7;
import java.util.Scanner;
/**
 *
 * @author 1DAW-mgutval
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escribe números. Si desea terminar, introduzca uno negativo");
        int num = 0;
        int suma = 0;
        
        while (num >= 0) {
            System.out.print("Número: ");
            num = sc.nextInt();
            if (num >= 0) {
                suma += num;
            }
        }
        System.out.println("La suma de los números introducidos es: " + suma);
    }
    
}
