/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej2;
import java.util.Scanner;
/**
 *
 * @author mrzan
 */
public class Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long num = 0, contador_eliminados = 0, alternativa, resultado = 0, multiplicador = 1;
        System.out.print("Introduzca un número entero positivo: ");
        num = sc.nextInt();
        while (num >= 0) {            
            alternativa = num;
            while (alternativa > 0) {
                if (alternativa % 10 != 0 && alternativa % 10 != 8) {
                    resultado += (alternativa % 10) * multiplicador;
                    multiplicador *= 10;
                } else {
                    contador_eliminados++;
                }
                alternativa = (alternativa / 10);
            }
            System.out.println("Número resultado: " + resultado);
            System.out.println("Dígitos eliminados: "+ contador_eliminados);
            
            System.out.print("Introduzca otro número entero positivo: ");
            num = sc.nextInt();
        }        
    }
    
}
