/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10;
import java.util.Scanner;
/**
 *
 * @author 1DAW-mgutval
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Primer jugador: ¿PIEDRA, PAPEL o TIJERAS?");
        String jugador1 = sc.next();
        
        System.out.println("Segundo jugador: ¿PIEDRA, PAPEL o TIJERAS?");
        String jugador2 = sc.next();
        
        if (jugador1.equals(jugador2)) {
            System.out.println("Empate");
        } else if (jugador1.equals("PIEDRA")) {
            if (jugador2.equals("PAPEL")) {
                System.out.println("Gana el jugador 2");
            } else {
                System.out.println("Gana el jugador 1");
            }
        } else if (jugador1.equals("PAPEL")) {
            if (jugador2.equals("TIJERAS")) {
                System.out.println("Gana el jugador 2");
            } else {
                System.out.println("Gana el jugador 1");
            }
        } else if (jugador1.equals("TIJERAS")) {
            if (jugador2.equals("PIEDRA")) {
                System.out.println("Gana el jugador 2");
            } else {
                System.out.println("Gana el jugador 1");
            }
        } else {
            System.out.println("Opción no válida");
        }
    }
    
}
