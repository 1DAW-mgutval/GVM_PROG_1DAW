/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucle.anidado.pkg3;

/**
 *
 * @author 1DAW-mgutval
 */
public class BucleAnidado3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        for(int i = 0; i < 10; i++) {
            for(int j = 0; !(i == j); j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        
    }
    
}
