package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AlumnoDAO {

    public List<Alumno> listar() {
        return listaFiltrada(0);
    }

    public boolean insertar(Alumno a) {
        String sql = "INSERT INTO alumno (id_alumno, nombre, email, isMayorEdad, id_curso) VALUES (?, ?, ?, ?, ?)";
        try (Connection con = Conexion.getConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, a.getId_alumno());
            ps.setString(2, a.getNombre());
            ps.setString(3, a.getEmail());
            ps.setInt(4, a.getIsMayorEdad());
            ps.setInt(5, a.getId_curso());
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            return false;
        }
    }

    public List<Alumno> listaFiltrada(int curso) {
        List<Alumno> filtrados = new ArrayList<>();
        String filtro = "SELECT * FROM alumno";
        if (curso > 0 && curso < 5) {
            filtro += " WHERE id_curso = "+curso;
        }
        try (Connection conexion = Conexion.getConexion();
             PreparedStatement ps = conexion.prepareStatement(filtro);
             ResultSet rs = ps.executeQuery()){

            while (rs.next()) {
                filtrados.add(new Alumno(
                        rs.getInt("id_alumno"),
                        rs.getString("nombre"),
                        rs.getString("email"),
                        rs.getInt("isMayorEdad"),
                        rs.getInt("id_curso")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return filtrados;
    }
}
