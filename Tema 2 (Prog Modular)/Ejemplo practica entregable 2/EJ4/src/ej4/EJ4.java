/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej4;
import java.util.Scanner;
/**
 *
 * @author 1DAW-mgutval
 */
public class EJ4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num, cifra, num1 = 0, num2 = 0, multiplo = 1, divisor1 = 0, divisor2 = 0;
        do {
            System.out.print("Introduce un número de 6 cifras: ");
            num = sc.nextInt();
        } while (num > 1000000 || num < 99999);
        
        while(num > 0) {
            if (num > 999) {
               cifra = num % 10;
               num1 += cifra * multiplo;
               num /= 10;
               multiplo *= 10; 
            } else {
                if (num >= 100) {
                    multiplo = 1;
                }
                cifra = num % 10;
                num2 += cifra * multiplo;
                num /= 10;
                multiplo *= 10; 
            }
        }
        
        int contador = 2;
        while (contador < num1 || divisor2 < 0) {
            if (num1 % contador == 0) {
                divisor1++;
            }
            contador++;
        }
        
        contador = 2;
        while (contador < num2 || divisor2 < 0) {
            if (num2 % contador == 0) {
                divisor2++;
            }
            contador++;
        }

        if (divisor1 == 0) {
            System.out.println(num1 + " - Es un número primo");
        } else {
            System.out.println(num1 + " - NO es un número primo");
        }
        
        if (divisor2 == 0) {
            System.out.println(num2 + " - Es un número primo");
        } else {
            System.out.println(num2 + " - NO es un número primo");
        }
    }
    
}
