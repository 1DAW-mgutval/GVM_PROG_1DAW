/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio8;
import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author 1DAW-mgutval
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Dime la base del triángulo:");
        double base = sc.nextDouble();
        System.out.println("Dime la altura del triángulo:");
        double altura = sc.nextDouble();
        
        System.out.println("Dime el radio del círculo:");
        double radio = sc.nextDouble();
        
        if ((base * altura / 2) > (Math.PI * Math.pow(radio, 2))) {
            System.out.println("El triángulo es mayor que el círculo");
        } else if ((base * altura / 2) < (Math.PI * Math.pow(radio, 2))) {
            System.out.println("El círculo es mayor que el triángulo");
        } else {
            System.out.println("Ambas figuras son igual de grandes");
        }
        System.out.println("es " + (base * altura / 2) + " " + ( Math.PI * Math.pow(radio, 2)));
    }
    
}
