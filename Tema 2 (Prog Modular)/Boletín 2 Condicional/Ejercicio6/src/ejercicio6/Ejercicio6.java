/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6;
import java.util.Scanner;
/**
 *
 * @author mrzan
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float precio;
        int entradas;
        
        System.out.println("Dime el precio por entrada: ");
        precio = sc.nextFloat();
        
        System.out.println("Dime el número de entradas que quiere: ");
        entradas = sc.nextInt();
        
        switch (entradas) {
            case 1:
                System.out.println("El precio es: " + precio + "€");
                break;
            case 2:
                System.out.println("Se descuenta el 10%. El precio final es: " + (entradas * (precio - precio * 0.10f)) + "€");
                break;
            case 3: 
                System.out.println("Se descuenta el 10%. El precio final es: " + (entradas * (precio - precio * 0.15f)) + "€");
                break;
            case 4:
                System.out.println("Se descuenta el 10%. El precio final es: " + (entradas * (precio - precio * 0.20f)) + "€");
                break;
            default:
                System.out.println("El número de entradas introducidas no es válido");
        }
        
    }
    
}
