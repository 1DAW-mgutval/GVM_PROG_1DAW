package Ej6;

public class Main {
    public static void main(String[] args) {
        Texto cadena1 = new Texto("Joseda guapo");
        System.out.println("----ACABA DE CREARSE----");
        cadena1.getInfo();
        System.out.println("----Caracter puesto delante y detrás----");
        cadena1.anadirCaracterPrincipio('W',true);
        cadena1.anadirCaracterPrincipio('W',false);
        cadena1.getInfo();
        System.out.println("----Cadena puesta delante y detrás----");
        cadena1.anadirCadenaPrincipio("MARIO", true);
        cadena1.anadirCadenaPrincipio("MARIO", false);
        cadena1.getInfo();
        System.out.println("----RECUENTO----");
        System.out.println("Vocales mayúsculas: "+cadena1.numVocalesMayusculas());
        System.out.println("Vocales minúsculas: "+cadena1.numVocalesMinusculas());
    }
}
