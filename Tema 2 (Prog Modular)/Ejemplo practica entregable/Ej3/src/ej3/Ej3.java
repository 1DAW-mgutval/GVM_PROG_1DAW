/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej3;
import java.util.Scanner;
/**
 *
 * @author 1DAW-mgutval
 */
public class Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca sus tres números favoritos:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        
        System.out.print("Introduzca el número de la lotería: ");
        int num_loteria = sc.nextInt();
        
        int digito, ocurrencias_suerte = 0, ocurrencias_malas = 0;
        while (num_loteria > 0) {
            digito = num_loteria % 10;
            if (digito == num1 || digito == num2 || digito == num3) {
                ocurrencias_suerte++;
            } else {
                ocurrencias_malas++;
            }
            System.out.println(num_loteria);
            num_loteria /= 10;
            System.out.println(num_loteria);
        }
        if (ocurrencias_suerte >= ocurrencias_malas) {
            System.out.println("Ese número le dará suerte");
        } else {
            System.out.println("Ese número no le dará suerte");
        }
    }
    
}
