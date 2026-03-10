/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7;
import java.util.Scanner;
/**
 *
 * @author 1DAW-mgutval
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dime un número natural de hasta 2 cifras:");
        int num = sc.nextInt();
        
        int falta;
        if (num >= 0 && num < 10) {
            falta = 10 - num;
            System.out.println("Faltan " + falta + " para que sea un número de 2 cifras");
        } else if (num >= 10 && num < 100) {
            falta = 100 - num;
            System.out.println("Faltan " + falta + " para que sea un número de 2 cifras");
        } else {
            System.out.println("El número introducido es de más de 2 cifras o es negativo");
        }
    }
    
}
