package ParteA;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        PARTE 1

//        System.out.println("Pon un número de personas:");
//        int numPersonas = sc.nextInt();
//        Persona listaPersonas[] = new Persona[numPersonas];
//
//        String nombreTemp, dniTemp;
//        int edadTemp, eleccionSexo;
//        double pesoTemp, alturaTemp;
//        Sexo sexoTemp;
//        for (int i = 0; i < listaPersonas.length; i++) {
//            System.out.println("Persona Nº "+(i+1));
//            System.out.print("Nombre: ");
//            nombreTemp = sc.next();
//            System.out.print("DNI: ");
//            dniTemp = sc.next();
//            System.out.print("Edad: ");
//            edadTemp = sc.nextInt();
//            System.out.print("Peso: ");
//            pesoTemp = sc.nextDouble();
//            System.out.print("Altura: ");
//            alturaTemp = sc.nextDouble();
//            System.out.print("Sexo (1 Masculino | 2 Femenino): ");
//            eleccionSexo = sc.nextInt();
//            switch (eleccionSexo) {
//                case 1 -> sexoTemp = Sexo.HOMBRE;
//                case 2 -> sexoTemp = Sexo.MUJER;
//                default -> sexoTemp = null;
//            }
//            listaPersonas[i] = new Persona(nombreTemp, edadTemp, dniTemp, pesoTemp, alturaTemp, sexoTemp);
//        }
//
//        for (int i = 0; i < listaPersonas.length; i++) {
//            switch (listaPersonas[i].calcularIMC()) {
//                case -1 -> System.out.println(listaPersonas[i].getNombre()+": "+" por debajo de su peso");
//                case 0 -> System.out.println(listaPersonas[i].getNombre()+": "+" peso ideal");
//                case 1 -> System.out.println(listaPersonas[i].getNombre()+": "+" sobrepeso");
//            }
//        }



//        PARTE 2
        Persona joseda = new Persona("Joseda", 19, "7819273J", 66, 1.78, Sexo.HOMBRE);
        Cafetera c1 = new Cafetera(15, 5, joseda);
        Cafetera c2 = new Cafetera();

        System.out.println("----CAFETERA 1----");
        c1.mostrarCafeDisponible();
        c1.agregarCafe(5);
        c1.servirTaza(2);
        System.out.println("-después 1-");
        c1.mostrarCafeDisponible();
        System.out.println("-llenar 1-");
        c1.llenarCafetera();
        c1.mostrarCafeDisponible();
        System.out.println("-vaciar 1-");
        c1.vaciarCafetera();
        c1.mostrarCafeDisponible();

        System.out.println("----CAFETERA 2----");
        c2.mostrarCafeDisponible();
        c2.agregarCafe(5);
        c2.servirTaza(2);
        System.out.println("-después 2-");
        c2.mostrarCafeDisponible();
        System.out.println("-llenar 2-");
        c2.llenarCafetera();
        c2.mostrarCafeDisponible();
        System.out.println("-vaciar 2-");
        c2.vaciarCafetera();
        c2.mostrarCafeDisponible();

    }
}
