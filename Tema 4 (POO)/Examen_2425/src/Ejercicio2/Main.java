package Ejercicio2;

public class Main {
    public static void main(String[] args) {
        BufferCircular b = new BufferCircular();
        b.insertar(9);
        b.insertar(5);
        b.insertar(4);
        b.insertar(8);
        b.insertar(3);
        b.mostrarBuffer();

        b.leer();
        b.leer();
        b.mostrarBuffer();

        System.out.println("El porcentaje del buffer es del " + b.estadoBuffer()+"%");

        b.insertar(0);
        b.insertar(8);
        b.insertar(5);
        b.insertar(6);
        b.insertar(1);
        b.insertar(2); // Da la vuelta y lo inserta en la primera posición
        b.mostrarBuffer();

        b.insertar(0);
        boolean intento1 = b.insertar(0); // No puede insertarlo
        boolean intento2 = b.insertar(0); // No puede insertarlo
        System.out.println("Primer intento:"+intento1+"\n Segundo intento: "+intento2);
        b.mostrarBuffer();

        System.out.println("El porcentaje del buffer es del " + b.estadoBuffer()+"%");

        Integer antiguo1 = b.leer(); //Lee el número más antiguo del buffer (el 4 en este caso)
        Integer antiguo2 = b.leer();
        System.out.println("Antiguo primero (debe ser 4):"+antiguo1+"\n Antiguo segundo: "+antiguo2);
        b.insertar(3); //Ahora si puede insertar de nuevo un número
        b.mostrarBuffer();
    }
}
