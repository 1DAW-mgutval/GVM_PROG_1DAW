/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej3;
import java.util.Scanner;
/**
 *
 * @author mrzan
 */
public class EJ3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Pedidos Pitanza Feliz");
        
        System.out.print("Número de hamburguesas básicas: ");
        int hamburguesa_basica = sc.nextInt();
        double precio_hb = 3;
        
        System.out.print("Número de hamburguesas gourmet: ");
        int hamburguesa_gourmet = sc.nextInt();
        double precio_hg = 5;
        
        System.out.print("Día de la semana: ");
        String dia = sc.next();
        
        double precio_hgM = 0;
        if (dia.equals("martes") && hamburguesa_gourmet >= 2) {
            precio_hgM = (hamburguesa_gourmet / 2 * 9);
            hamburguesa_gourmet %= 2;
        } else if (dia.equals("miércoles")) {
            precio_hb = 2;
        }
        
        System.out.print("¿Perteneces al club Fanegas? (s/n): ");
        String club = sc.next();
        double descuento = 0;
        double descuento_total = 0;
        
        double total = (hamburguesa_basica * precio_hb) + (hamburguesa_gourmet * precio_hg) + (precio_hgM);
        if (club.equals("s")) {
            descuento = 0.12;
            descuento_total = total * descuento;
        } else if (!(club.equals("n"))){
            System.out.println("No ha indicado bien si pertenece al club. No se aplicará descuento por defecto.");
        }
        
        System.out.println("");
        System.out.println("Aquí tiene su pedido. Gracias por su compra");
        if (hamburguesa_basica > 0) {
            System.out.println("Hamburguesas básicas: " + hamburguesa_basica);
        } if (hamburguesa_gourmet > 0) {
            System.out.println("Hamburguesas gourmet: " + hamburguesa_gourmet);
        }
        System.out.println("Total: " + total + "€");
        System.out.println("Total: " + descuento_total + "€");
        System.out.println("A pagar: " + (total - descuento_total) + "€");
        
    }
    
}
