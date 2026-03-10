/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejclase;

/**
 *
 * @author 1DAW-mgutval
 */
public class Ejclase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        for(int i = 9; i >= 1; i--) {
            for(int j = 1; j <= 9; j++) {
                if (!(i == j)) {
                    System.out.print(" - ");
                } else {
                    System.out.print(" x ");
                }
            }
            System.out.println("");
        }
    }
    
}
