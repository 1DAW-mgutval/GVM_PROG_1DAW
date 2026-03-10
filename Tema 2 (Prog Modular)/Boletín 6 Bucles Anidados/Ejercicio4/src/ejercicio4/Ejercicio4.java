/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;
import java.util.Scanner;
/**
 *
 * @author 1DAW-mgutval
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Fecha de nacimiento:");
        System.out.print("Día: ");
        int dia_nacimiento = sc.nextInt();
        System.out.print("Mes: ");
        int mes_nacimiento = sc.nextInt();
        System.out.print("Año: ");
        int año_nacimiento = sc.nextInt();
        
        System.out.println("Fecha actual:");
        System.out.print("Día: ");
        int dia_actual = sc.nextInt();
        System.out.print("Mes: ");
        int mes_actual = sc.nextInt();
        System.out.print("Año: ");
        int año_actual = sc.nextInt();
        
        int edad = año_actual - año_nacimiento;
        if (mes_actual < mes_nacimiento) {
            System.out.println("Tienes " + edad + " años");
        } else {
            if (dia_actual >= dia_nacimiento) {
                System.out.println("Tienes " + edad + " años");
            } else {
                System.out.println("Tienes " + (edad - 1) + " años");
            }
        }
    }
    
}
