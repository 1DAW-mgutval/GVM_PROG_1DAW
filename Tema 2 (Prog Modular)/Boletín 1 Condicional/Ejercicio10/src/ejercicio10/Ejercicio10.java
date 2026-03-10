/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10;
import java.util.Scanner;
/**
 *
 * @author 1DAW-mgutval
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int edad;
        String nombre;
        
        System.out.println("Dime tu nombre: ");
        nombre = sc.next();
        
        System.out.println("Dime tu edad: ");
        edad = sc.nextInt();
        
        System.out.println("Hola " + nombre + ", tienes " + edad + " años, ¡que mayor eres!");
    }
    
}
