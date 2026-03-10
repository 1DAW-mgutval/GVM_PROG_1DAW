package examen2_gvm;

import java.util.Arrays;

public class ejercicio1 {
    public static void main(String[] args) {
        String jugadores[] = {"Calderon","Rudy Fernandez","Juan Carlos Navarro","Pau Gasol","Felipe Reyes"};
        String rivales[] = {"Croacia","Lituania"};

        int puntosEspana[][] = {
            // Puntos Calderon
            {5,7}, 
            // Puntos Rudy Fernandez
            {22,8},
            // Puntos Juan Carlos Navarro
            {12,10},
            // Puntos Pau Gasol
            {20,19},
            // Puntos Felipe Reyes
            {6,12}
        };

        System.out.println("--- Estadísticas iniciales ---");
        mostrarPuntuacionMasAlta(puntosEspana, jugadores, rivales);
        calcularMaximoAnotadorEquipo(puntosEspana, jugadores);

        String nuevoRival = "Estados Unidos";
        int puntosNuevoPartido[] = {
            // Puntos nuevo Calderon
            10,
            // Puntos nuevo Rudy Fernandez
            15,
            // Puntos nuevo Juan Carlos Navarro
            12,
            // Puntos nuevo Pau Gasol
            21,
            // Puntos nuevo Felipe Reyes
            31
        };

        // Añadir puntos del nuevo partido.
        puntosEspana = anadirPuntos(puntosEspana, puntosNuevoPartido);
        // Añadir al rival
        rivales = anadirRival(rivales, nuevoRival);

        System.out.println("\n--- Estadísticas tras añadir el nuevo partido ---");
        mostrarPuntuacionMasAlta(puntosEspana, jugadores, rivales);
        calcularMaximoAnotadorEquipo(puntosEspana, jugadores);

    }
    
    // Función para mostrar la puntuación más alta.
    public static void mostrarPuntuacionMasAlta(int[][] puntosEspana, String[] jugadores, String[] rivales) {
        // Guardo la puntuación general que se ha obtenido, de esa puntuación quiero saber en qué columna (la posición del jugador en el array de nombres de jugadores) y en qué
        // fila (la posicón del nombre en el array de los rivales) está.
        int puntuacionMaximaPartido = 0, posicionJugador= 0, posicionRival = 0;
        // Antes de nada, compruebo que las filas de puntosEspana y jugadores la longitud de jugadores sean la misma. Además, las columnas de puntosEspana y la longitud de rivales
        // también debe de ser igual, sino dará error.
        if (puntosEspana.length == jugadores.length && puntosEspana[0].length == rivales.length) {
            for (int i = 0; i < puntosEspana.length; i++) {
                for (int j = 0; j < puntosEspana[i].length; j++) {
                    if (puntosEspana[i][j] > puntuacionMaximaPartido) {
                        puntuacionMaximaPartido = puntosEspana[i][j];
                        posicionJugador = i;
                        posicionRival = j;
                    }
                }
            }
            System.out.println("Máxima anotación en un partido: " + jugadores[posicionJugador] +" - " + puntuacionMaximaPartido + " pts en el partido contra " + rivales[posicionRival]);
        } else {
            System.out.println("ERROR. Función mostrarPuntuacionMasAlta no funciona, los datos introducidos no son correctos.");
        }
    }

    // Función para mostrar el máximo anotador general.
    public static void calcularMaximoAnotadorEquipo(int[][] puntosEspana, String[] jugadores) {
        int puntosTotalesCadaJugador[] = new int[puntosEspana.length];
        int maximaPuntuacion = 0, indiceJugador = 0;

        // Antes de nada compruebo que la lista de jugadores sea igual de larga que las filas de los puntos que hay, sino dará error.
        if (puntosEspana.length == jugadores.length) {
            // Guardo la anotación total (sumando todos los partidos) de cada jugador
            for (int i = 0; i < puntosEspana.length; i++) {
                for (int j = 0; j < puntosEspana[i].length; j++) {
                    puntosTotalesCadaJugador[i] += puntosEspana[i][j];
                }
            }
    
            // Compruebo qué puntuación es la mayor, además me guardo la posición en que aparece el jugador, para saber su índice y decir su nombre.
            for (int i = 0; i < puntosTotalesCadaJugador.length; i++) {
                if (puntosTotalesCadaJugador[i] > maximaPuntuacion) {
                    maximaPuntuacion = puntosTotalesCadaJugador[i];
                    indiceJugador = i;
                }
            }
    
            System.out.println("Máximo anotador del torneo: " +jugadores[indiceJugador]+" - "+maximaPuntuacion+" pts en total.");
        } else {
            System.out.println("ERROR. Función calcularMaximoAnotadorEquipo no funciona, los datos introducidos no son correctos.");
        }

    }

    // Función para añadir los puntos de un nuevo partido jugado.
    public static int[][] anadirPuntos(int puntosEspana[][], int puntosNuevoPartido[]) {
        int puntosEspanaAnadidos[][] = new int[puntosEspana.length][puntosEspana[0].length+1];

        // Compruebo que haya un número de puntos para cada jugador, que no haya para más jugadores ni para menos.
        if (puntosNuevoPartido.length == puntosEspana.length) {
            for (int i = 0; i < puntosEspanaAnadidos.length; i++) {
                for (int j = 0; j < puntosEspanaAnadidos[i].length; j++) {
                    if (j == puntosEspanaAnadidos[i].length-1) {
                        puntosEspanaAnadidos[i][j] = puntosNuevoPartido[i];
                    } else {
                        puntosEspanaAnadidos[i][j] = puntosEspana[i][j];
                    }
                }
            }
        }
        // Si número de nuevos puntos del partido no coinciden, devuelvo el array que he creado pero vacío.
        return puntosEspanaAnadidos;
    }

    // Función para añadir el rival nuevo
    public static String[] anadirRival (String rivales[], String rival) {
        // Creo un array de String del mismo tamaño que el que se pasa como parámetro + 1, ya que solo voy a añadir un nuevo dato (1 nuevo rival).
        String todosRivales[] = Arrays.copyOf(rivales, rivales.length+1);
        // En la última posición del array meto el nuevo rival.
        todosRivales[todosRivales.length-1] = rival;
        return todosRivales;
    }
}
