/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7;
import java.util.Scanner;
/**
 *
 * @author mrzan
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float paga;
        int horas;
        String horario;
        
        System.out.println("¿Cuál es tu horario? (diurno/nocturno)");
        horario = sc.next();
        
        System.out.println("Horas trabajadas: ");
        horas = sc.nextInt();
        
        switch (horario) {
            case "diurno":
                paga = 12 * horas;
                if (paga > 120) {
                    System.out.println("Debes cobrar " + (paga - paga * 0.05f) + "€");
                } else {
                    System.out.println("Debes cobrar " + paga + "€");
                }
                break;
            case "nocturno":
                paga = 20 * horas;
                if (paga > 120) {
                    System.out.println("Debes cobrar " + (paga - paga * 0.05f) + "€");
                } else {
                    System.out.println("Debes cobrar " + paga + "€");
                }
                break;
            default:
                System.out.println("Horario no válido");
        }
    }
    
}
