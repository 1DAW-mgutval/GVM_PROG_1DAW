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
public class EJ1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int altura = 4;
        while (altura % 2 == 0 || altura <= 3) {
            System.out.println("Dime la altura: ");
            altura = sc.nextInt();
            if (altura % 2 == 0 || altura <= 3) {
                System.out.println("ERROR: Introduzca una altura válida.");
            }
        }
        
        int ancho = altura * 2 + 4;
        int mitad_altura, comienzo_y = altura+5;
        int mitad_y = (comienzo_y + ancho)/2;
        mitad_altura = altura/2+1;
        
        for(int i = altura; i > 0; i--) {
            for(int j = 1; j <= ancho; j++) {
                if (j == 1 || j == altura) {
                    System.out.print("*");
                } else if (j == mitad_y&& i <= mitad_altura){
                    System.out.print("*");
                } else if ((j == ancho || j == comienzo_y) && i == altura) {
                    System.out.print("*");
                } else if (j + i == altura + comienzo_y && i >= mitad_altura) {
                    System.out.print("*");
                } else if ( j - i == ancho - altura && i >= mitad_altura) {
                    System.out.print("*");
                } else if (j +  i == altura+1 && i >= mitad_altura) {
                    System.out.print("*");
                } else if (j - i == 0 && i >= mitad_altura) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        
    }
    
}
