/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucleanidado2;

/**
 *
 * @author 1DAW-mgutval
 */
public class BucleAnidado2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        for(int i = 0; i < 5; i ++) {
            for(int j = 0; j < 5; j ++) {
                if (i == j) {
                    System.out.print(" X ");
                } else {
                    System.out.print(" - ");
                }
            }
            System.out.println("");
        }
    }
    
}
