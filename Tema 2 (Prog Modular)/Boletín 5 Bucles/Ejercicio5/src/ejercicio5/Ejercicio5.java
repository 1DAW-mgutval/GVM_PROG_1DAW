/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;

/**
 *
 * @author 1DAW-mgutval
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        long multiplicacion = 1;
        
        for(int i = 1; i <= 20; i++) {
        multiplicacion = multiplicacion * i;
        }
        System.out.println("La multiplicación de los números desde 1 - 20 es: " + multiplicacion);
    }
    
}
