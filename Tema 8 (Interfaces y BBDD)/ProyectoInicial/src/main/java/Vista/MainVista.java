package Vista;

import Controlador.GestorAlumnos;

public class MainVista {
    public static void main(String[] args) {
        // Arrancar Swing en el hilo correcto
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                AlumnosVista vista = new AlumnosVista();
                // AlumnoDAO dao = new AlumnoDAO();
                GestorAlumnos controlador = new GestorAlumnos();
                vista.setVisible(true);
            }
        });
    }
}
