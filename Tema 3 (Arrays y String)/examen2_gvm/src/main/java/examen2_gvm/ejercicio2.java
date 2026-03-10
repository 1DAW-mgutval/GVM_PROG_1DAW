package examen2_gvm;

import java.util.Arrays;

public class ejercicio2 {
    public static void main(String[] args) {
        // Compruebo en el main el ejercicio 1
        String cancionesRobeIniesta[] = {
            "Jesucristo García",
            "Estoy muy bien",
            "Quemando tus recuerdos",
            "Ama, ama, ama y ensancha tu alma",
            "Sucede",
            "Segundo movimiento: Lo de fuera"
        };
        
        for (int i = 0; i < cancionesRobeIniesta.length; i++) {
            // Si la canción tien más de 10 caracteres, le aplico la función para transformarla en mayúscula.
            if (cancionesRobeIniesta[i].length() > 10) {
                for (int j = 0; j < cancionesRobeIniesta[i].length(); j++) {
                    cancionesRobeIniesta[i] = transformarMayusculas(cancionesRobeIniesta[i]);
                }
            }
        }
        System.out.println("Canciones:");
        System.out.println(Arrays.toString(cancionesRobeIniesta));

        // Compruebo en el main el ejercicio 2
        String canciones1[] = {
            "Estoy muy bien",
            "Quemando tus recuerdos",
            "Del tiempo perdido",
            "Un suspiro acompasado"
        };
        String canciones2[] = {
        };

        String resultado[] = combinaCanciones(canciones1, canciones2);

        System.out.println("\nResultado de combinar");
        System.out.println(Arrays.toString(resultado));
    }

    // Función para el apartado 1
    public static String transformarMayusculas(String frase) {
        // Primero hago un array con las posiciones en las que aparecen los espacios.
        // Ya que después de cada espacio siempre empezará una palabra.
        int posicionesEspacios[] = new int[1];
        boolean primero = true;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == ' ') {
                // La primera vez el array vale 1, por lo que simplemente meto el número, después tengo que aumentar el tamaño del array y meter el número.
                if (primero) {
                    posicionesEspacios[posicionesEspacios.length-1] = i;
                    primero = false;
                } else {
                    posicionesEspacios = Arrays.copyOf(posicionesEspacios, posicionesEspacios.length+1);
                    posicionesEspacios[posicionesEspacios.length-1] = i;
                }
            }
        }

        // Formo la frase en una varibale String
        String fraseMayusculas = "";
        // Controlo el índice el array de posicionesEspacios para que no se salga de la longitud
        int indicePosicionesEspacios = 0;
        // Convierto el caracter después de un espacio a mayúscula
        for (int i = 0; i < frase.length(); i++) {
            if (i == (posicionesEspacios[indicePosicionesEspacios])+1 || i == 0) {
                // Debo convertir el caracter a String para poder usar el "toUpperCase"
                fraseMayusculas += String.valueOf(frase.charAt(i)).toUpperCase();
                if (i != 0) {
                    indicePosicionesEspacios++;
                    // Compruebo que el indice no se salga del tamaño del array para que no de fallo al hacer la comprobación del if. Para cuando llegue al último espacio.
                    if (posicionesEspacios.length == indicePosicionesEspacios) {
                        indicePosicionesEspacios--;
                    }
                }
            } else {
                fraseMayusculas += frase.charAt(i);
            }
        }
        return fraseMayusculas;
    }

    // Función para el apartado 2
    public static String [] combinaCanciones(String canciones1[], String canciones2[]) {
        // Creo un array nuevo con el tamaño de los dos arrays que se pasan como parámetro sumados.
        String resultado[] = new String[canciones1.length+canciones2.length];

        int indiceCanciones1 = 0, indiceCanciones2 = 0;
        for (int i = 0; i < resultado.length; i++) {
            // Si el índice llega al límite de uno de los arrays, se añade lo que queda del otro array.
            if (indiceCanciones1 < canciones1.length && indiceCanciones2 < canciones2.length) {
                // Distingo entre pares e impares para ir intercalando las canciones de un array y otro.
                if (i % 2 == 0) {
                    resultado[i] = canciones1[indiceCanciones1];
                    indiceCanciones1++;
                } else {
                    resultado[i] = canciones2[indiceCanciones2];
                    indiceCanciones2++;
                }
            } else {
                if (indiceCanciones1 == canciones1.length) {
                    resultado[i] = canciones2[indiceCanciones2];
                    indiceCanciones2++;
                } else {
                    resultado[i] = canciones1[indiceCanciones1];
                    indiceCanciones1++;
                }
            }
        }
        return resultado;
    }
}
