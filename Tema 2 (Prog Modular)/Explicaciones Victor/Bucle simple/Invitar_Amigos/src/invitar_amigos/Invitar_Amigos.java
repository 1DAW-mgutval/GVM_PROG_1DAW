/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package invitar_amigos;
import java.util.Scanner;
/**
 *
 * @author 1DAW-mgutval
 */
public class Invitar_Amigos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dinero que tienes:");
        double dinero = sc.nextDouble();
        
        System.out.println("Precio de un refresco:");
        double precio = sc.nextDouble();
        
        double inicio = dinero;
        String pregunta;
        int invitados = 0;
        do {
            System.out.println("Dispones de " + dinero + "€. ¿Quieres invitar a un amigo? (SI/NO)");
            pregunta = sc.next();
            
            if (pregunta.equals("SI")) {
                dinero = dinero - precio;
                invitados++;
            } else if (pregunta.equals("NO")){
                System.out.println("Se acabó invitar");
            } else {
                System.out.println("Opción no válida");
            }
        } while(!pregunta.equals("NO") && dinero >= precio);
        
        System.out.println("Número de amigos invitados: " + invitados);
        System.out.println("Cantidad gastada: " + (inicio - dinero));
        System.out.println("Dinero que tienes para mañana: " + dinero);
    }
    
}
