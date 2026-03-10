/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7.pkg5;
import java.util.Scanner;
/**
 *
 * @author 1DAW-mgutval
 */
public class Ejercicio75 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int nota;
        boolean suspenso = false;
        for(int i = 1; i < 6; i++) {
            System.out.print("Nota del alumno: ");
            nota = sc.nextInt();
            
            if (nota < 5) {
                suspenso = true;
            }
        }
        
        if (suspenso) {
            System.out.println("Al menos un alumno está suspenso.");
        } else {
            System.out.println("Ningún alumno está suspenso.");
        }
    }
    
}
