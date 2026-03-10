/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio11;
import java.util.Scanner;
/**
 *
 * @author 1DAW-mgutval
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escriba 10 números");
        int num;
        double media = 0;
        double contador_negativos = 0;
        int ceros = 0;
        int suma = 0;
        
        for(int i = 1; i < 11; i++) {
            System.out.print("Número: ");
            num = sc.nextInt();
            if (num > 0) {
                suma += num;
            } else if (num < 0) {
                media += num;
                contador_negativos++;
            } else {
                ceros++;
            }
        }
        
        System.out.println("Suma de los números positivos: " + suma);
        System.out.println("Media de los números negativos: " + (media / contador_negativos));
        System.out.println("Número de ceros introducidos:" + ceros);
    }
    
}
