package Pruebas;

import Modelo.Alumno;
import Modelo.AlumnoDAO;
import Modelo.Conexion;

import java.sql.Connection;
import java.util.List;

public class MainPruebas {
    public static void main(String[] args) {
        List<Alumno> alumnos = new AlumnoDAO().listar();
        for (Alumno alumno : alumnos)  {
            System.out.println(alumno);
        }
        System.out.println("-------------------------------------");

        List<Alumno> alumnosFiltrados = new AlumnoDAO().listaFiltrada(0);
        for (Alumno alumno : alumnosFiltrados)  {
            System.out.println(alumno);
        }
    }
}