/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio8;
import java.util.Scanner;
/**
 *
 * @author mrzan
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escoge una opción: ");
        System.out.println("SUMAR. RESTAR. MULTIPLICAR. DIVIDIR. SALIR.");
        String operacion = sc.next();
        
        System.out.println("Dime el primer número de la operación: ");
        float num1 = sc.nextInt();
        
        System.out.println("Dime el segundo número de la operación: ");
        float num2 = sc.nextInt();
        
        switch (operacion) {
            case "SUMAR":
                System.out.println( num1 + " + " + num2 + " = " + (num1 + num2));
                break;
            case "RESTAR":
                System.out.println( num1 + " - " + num2 + " = " + (num1 - num2));
                break;
            case "MULTIPLICAR":
                System.out.println( num1 + " x " + num2 + " = " + (num1 * num2));
                break;
            case "DIVIDIR":
                System.out.println( num1 + " / " + num2 + " = " + (num1 / num2));
                break;
            case "SALIR":
                System.out.println("Adiós");
                break;
            default:
                System.out.println("Opción no válida.");
        }
        
    }
    
}
