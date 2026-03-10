/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;
import java.util.Scanner;
/**
 *
 * @author mrzan
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad;
        String nombre;
        boolean carnet, medico;
        
        System.out.println("Dime tu edad: ");
        edad = sc.nextInt();
        
        System.out.println("Dime tu nombre: ");
        nombre = sc.next();
        
        System.out.println("Dime si tienes el carnet (true/false): ");
        carnet = sc.nextBoolean();
        
        System.out.println("Dime si tienes el certificado médico en vigor (true/false): ");
        medico = sc.nextBoolean();
        
        if (edad >= 18 && carnet && medico) {
            System.out.println("Eres apto para conducir");
        } else if (edad < 0) {
            System.out.println("Has introducido una edad no válida");
        } else {
            System.out.println("No eres apto para conducir");
        }
    }
    
}
