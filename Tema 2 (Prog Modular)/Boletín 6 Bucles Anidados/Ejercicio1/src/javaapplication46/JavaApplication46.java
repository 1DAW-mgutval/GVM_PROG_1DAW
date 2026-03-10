/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication46;
import java.util.Scanner;
/**
 *
 * @author 1DAW-mgutval
 */
public class JavaApplication46 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce el número de segundos:");
        int segundos = sc.nextInt();
        
        int minutos = 0;
        int horas = 0;
        
        while (segundos >= 60) {
            while (segundos >= 3600) {
                horas++;
                segundos += -3600;
            }
            if (segundos >= 60) {
                minutos++;
                segundos += -60;
            }
        }
        System.out.println(horas + "h, " + minutos + " minutos y " + segundos + " segundos.");
    }
    
}
