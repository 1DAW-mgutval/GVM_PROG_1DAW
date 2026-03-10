/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucle4;
import java.util.Scanner;
/**
 *
 * @author 1DAW-mgutval
 */
public class Bucle4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int suma = 0;
        int par = 0;
        int negativo = 0;
        int mayor = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        for(int i = 1; i < 6; i ++) {
            System.out.println("Dime un número entero");
            int num = sc.nextInt();
            suma = suma + num;
            if (num % 2 == 0) {
                par = ++par;
            } if (num < 0) {
                negativo = ++negativo;
            } if (num > Integer.MIN_VALUE && num >= mayor) {
                mayor = num;
            } if (num < Integer.MAX_VALUE && num <= menor) {
                menor = num;
            }
        }
        System.out.println("La suma de todos los números es " + suma);
        System.out.println("La cantidad de números pares es " +  par);
        System.out.println("La cantidad de números negativos es " + negativo);
        System.out.println("El número mayor es " + mayor);
        System.out.println("El número menor es " + menor);
    }
    
}
