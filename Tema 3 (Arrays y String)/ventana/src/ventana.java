import java.util.Scanner;

public class ventana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int eleccion;
        int seguir;

        do {
            pintarMenu();
            do {
                eleccion = sc.nextInt();
                if (eleccion < 1 || eleccion > 5) {
                    System.out.println("ERROR. Elección no válida. Inténtelo de nuevo:");
                }
            } while (eleccion < 1 || eleccion > 5);
            
            if (eleccion == 1) {
                pintarVentanaVacía();
            } else if (eleccion == 2) {
                pintarVentanaIzquierda('o');
            } else if (eleccion == 3) {
                pintarVentanaIzquierda('-');
            } else if (eleccion == 4) {
                pintarVentanaDerecha('o');
            } else if (eleccion == 5) {
                pintarVentanaDerecha('-');
            }

            System.out.println("¿Quieres jugar otra partida? (1=SI 0=NO)");
            do {
                seguir = sc.nextInt();
                if (seguir > 1 || seguir < 0) {
                    System.out.println("ERROR. Elección equivocada. Inténtelo de nuevo");
                }
            } while (seguir > 1 || seguir < 0);

        } while (seguirJugando(seguir));
    }

    public static void pintarMenu (){
        System.out.println("PINTAR VENTANAS \n =================== \n 1. Pintar ventana vacía \n 2. Pintar ventana izquierda con 'o' \n 3. Pintar ventana izquierda con '-' \n 4. Pintar ventana derecha con 'o' \n 5. Pintar ventana derecha con '-' \n Elija una opción (1, 2, 3, 4, o 5)");
    }

    public static void pintarVentanaVacía() {
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j < 22; j++) {
                if (i == 0 || i == 9 || j % 7 == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void pintarVentanaIzquierda (char relleno) {
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j < 22; j++) {
                if (i == 0 || i == 9 || j % 7 == 0) {
                    System.out.print("*");
                } else if (j < 7 && i > 0 && i < 9) {
                    System.out.print(relleno);
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void pintarVentanaDerecha (char relleno) {
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j < 22; j++) {
                if (i == 0 || i == 9 || j % 7 == 0) {
                    System.out.print("*");
                } else if (j > 14 && j < 21 && i > 0 && i < 9) {
                    System.out.print(relleno);
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static boolean seguirJugando(int eleccion) {
        boolean resultado = true;
        if (eleccion == 0) {
            resultado = false;
        }
        return resultado;
    }
}
