/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio8;
import java.util.Scanner;
/**
 *
 * @author 1DAW-mgutval
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escribe números positivos, para terminar escriba uno negativo");
        int num = 1;
        int contador = 0;
        
        while (num  > 0) {
            System.out.print("Número: ");
            num = sc.nextInt();
            if (num > 0) {
                contador++;
            }
        }
        System.out.println("Números totales escritos: " + contador);
    }
    
}
