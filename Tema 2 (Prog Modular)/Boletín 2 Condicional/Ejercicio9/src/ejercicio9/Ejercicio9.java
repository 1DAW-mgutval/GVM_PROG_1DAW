/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9;
import java.util.Scanner;
/**
 *
 * @author 1DAW-mgutval
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Elige tu topping:");
        System.out.println("- sin topping");
        System.out.println("- oreo");
        System.out.println("- kitkat");
        System.out.println("- lacasitos");
        System.out.println("- conguitos");
        System.out.print("Elgie una opción: ");
        
        String topping = sc.nextLine();
        float coste = 1.90f;
        
        if (topping.equals("sin topping")) {
            System.out.println("Tienes que pagar " + coste);
        } else if (topping.equals("oreo") || topping.equals("kitkat")) {
            System.out.println("Tienes que pagar " + (coste + 1));
        } else if (topping.equals("lacasitos") || topping.equals("conguitos")) {
            System.out.println("Tienes que pagar " + (coste + 0.5f));
        } else {
            System.out.println("Opción incorrecta (asegurate que la opción está en minúscula)");
        }
                
            
        
        
    }
    
}
