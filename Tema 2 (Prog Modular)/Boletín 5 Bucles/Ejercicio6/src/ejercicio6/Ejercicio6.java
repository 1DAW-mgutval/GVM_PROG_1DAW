/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6;

/**
 *
 * @author 1DAW-mgutval
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int suma = 0;
        
        System.out.println("Suma de números pares de 1 a 20:");
        for(int i = 2; i <= 20; i = i + 2) {
            suma = suma + i;
        }
        System.out.println(suma);
        
        long multiplicacion = 1;
        System.out.println("Multiplicación de números impares de 1 a 20");
        for(int i = 1; i <= 19; i = i + 2) {
            multiplicacion *= i;
        }
        System.out.println(multiplicacion);
    }
    
}
