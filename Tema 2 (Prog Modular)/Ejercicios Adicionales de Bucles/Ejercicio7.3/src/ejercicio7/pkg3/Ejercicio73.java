/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7.pkg3;

/**
 *
 * @author 1DAW-mgutval
 */
public class Ejercicio73 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long resultado = 1;
        
        for(int i = 1; i < 20; i += 2) {
            resultado *= i;
        }
        System.out.println("Resultado: " + resultado);
    }
    
}
