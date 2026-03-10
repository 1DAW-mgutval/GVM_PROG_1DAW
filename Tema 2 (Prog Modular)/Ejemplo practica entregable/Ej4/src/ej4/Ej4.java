/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej4;
import java.util.Scanner;
/**
 *
 * @author 1DAW-mgutval
 */
public class Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduzca horas: ");
        int horas = sc.nextInt();
        System.out.print("Introduzca minutos: ");
        int minutos = sc.nextInt();
        System.out.print("Introduzca segundos: ");
        int segundos = sc.nextInt();
        System.out.print("Introduzca segundos a incrementar: ");
        int incremento = sc.nextInt();
        
        System.out.println("Aumentando la hora...");
        while (incremento > 0) {
            if (segundos >= 0 && segundos < 59) {
                segundos++;
            } else {
                segundos = 0;
                minutos++;
            }
            if (minutos == 60) {
                minutos = 0;
                horas++;
            }
            if (horas == 24) {
                horas = 0;
            }
            System.out.println(horas + ":" + minutos + ":" + segundos);
            incremento--;
        }
    }
    
}
