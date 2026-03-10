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
public class EJ2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca un número:");
        int num = sc.nextInt();
        
        System.out.println("Introduzca el salto:");
        int salto = sc.nextInt();
        
        int divisor = 10, resultado = 0, multiplicador = 1, digito = 0;
        if (num <= 0) {
            System.out.println("El número debe de ser positivo.");
        } else if (salto > 2 || salto < 0) {
            System.out.println("El número de saltos debe estar comprendido entre 0 y 2");
        } else {
            while (multiplicador > digito) {
                switch (salto) {
                    case 1:
                        digito = num % 10 * multiplicador;
                        resultado += digito;
                        divisor = 100;
                        num /= divisor;
                        break;
                    case 2:
                        digito = num % 10 * multiplicador;
                        resultado += digito;
                        divisor = 1000;
                        num /= divisor;
                        break;
                    default:
                        digito = num % 10 * multiplicador;
                        resultado += digito;
                        num /= 10;
                        break;
                }
                multiplicador *= 10;
            }
            System.out.println("Resultado: " + resultado);
        }
    }
    
}
