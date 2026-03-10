/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucle1;
import java.util.Scanner;
/**
 *
 * @author 1DAW-mgutval
 */
public class Bucle1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String nombre;
        int edad;
        int media = 0;
        
        for(int contador = 1; contador <= 3; contador ++) {
            System.out.println("Dime el nombre del alumno");
            nombre = sc.next();
            
            System.out.println("Dime la edad del alumno");
            edad = sc.nextInt();
            
            media = edad + media;
        }
        float total = media / 3;
        System.out.println("La media es: " + total);
    }
    
}
