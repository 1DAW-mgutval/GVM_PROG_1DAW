/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author mrzan
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        
        float compra, descuento;
        int num = rand.nextInt(100) + 1;
        
        System.out.println("Dime cuánto ha sido tu compra: ");
        compra = sc.nextFloat();
        
        if (num < 60) {
            descuento = 0.15f * compra;
            System.out.println("Tu compra era " +  compra + "€. El descuento es del 15%, se descuentan " + descuento + "€. El total sería: " + (compra - descuento));
        } else {
            descuento = compra * 0.20f;
            System.out.println("Tu compra era " +  compra + "€. El descuento es del 20%, se descuentan " + descuento + "€. El total sería: " + (compra - descuento));
        }
        
        
        
    }
    
}
