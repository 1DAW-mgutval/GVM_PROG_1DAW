/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg7.pkg1;
import java.util.Scanner;
/**
 *
 * @author 1DAW-mgutval
 */
public class Ejercicio71 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num, inicio, fin;
        
        do {
            System.out.println("Inicio del rango: ");
            inicio = sc.nextInt();
            System.out.println("Fin del rango: ");
            fin = sc.nextInt();
            
            if (fin < inicio) {
                System.out.println("ERROR. El número inicial debe ser menor que el número final.");
            }
            
        } while (fin < inicio);
        
        do {
            System.out.println("Número dentro del rango: ");
            num = sc.nextInt();
        } while (num < inicio || num > fin);
        
        System.out.println("CORRECTO. Número válido.");
        
    }
    
}
