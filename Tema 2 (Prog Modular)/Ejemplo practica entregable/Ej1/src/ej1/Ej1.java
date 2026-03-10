/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej1;
import java.util.Scanner;
/**
 *
 * @author mrzan
 */
public class Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Intriduzca la altura de los calcetines: ");
        int altura = sc.nextInt();
        
        while (altura > 0) {
            while (altura > 2) {
                System.out.println("***     ***");
                altura--;
            }
            System.out.println("******  ******");
            altura--;
        }
    }
    
}
