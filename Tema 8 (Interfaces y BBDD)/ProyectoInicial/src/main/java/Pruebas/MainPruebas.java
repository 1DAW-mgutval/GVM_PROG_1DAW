package Pruebas;

import Modelo.Conexion;

import java.sql.Connection;

public class MainPruebas {
    public static void main(String[] args) {
        Connection conexion = Conexion.conectar();
        System.out.println(conexion);
    }
}