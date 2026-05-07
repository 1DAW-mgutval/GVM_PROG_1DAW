package Controlador;

import Modelo.Alumno;
import Modelo.AlumnoDAO;

import java.util.List;

public class GestorAlumnos {
    private AlumnoDAO dao = new AlumnoDAO();

    public void mostrarTodosAlumnos() {
        List<Alumno> alumnos = dao.listar();

    }
}
