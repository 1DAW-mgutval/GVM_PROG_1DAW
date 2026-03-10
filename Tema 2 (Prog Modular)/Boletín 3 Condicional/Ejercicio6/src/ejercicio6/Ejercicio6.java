/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6;
import java.util.Scanner;
/**
 *
 * @author 1DAW-mgutval
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dime un número entero del 0 al 9999");
        int numero = sc.nextInt();
        
        if (numero >= 0 && numero <=9) {
            System.out.println("El núermo tiene 1 cifra");
        } else if (numero >= 10 && numero <= 99) {
            System.out.println("El número tiene 2 cifras");
        } else if (numero >= 100 && numero <= 999) {
            System.out.println("El número tiene 3 cifras");
        } else if (numero >= 1000 && numero <= 9999) {
            System.out.println("El número tiene 4 cifras");
        } else {
            System.out.println("El número introducido no es válido");
        }
    }
    
}
