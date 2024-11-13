package Datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAOLugar {

    // Método para insertar un nuevo lugar en la base de datos
    public void insertarLugar(String nombre) {
        String sql = "INSERT INTO lugares (nombre) VALUES (?)";
        
        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, nombre);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Método para actualizar los datos de un lugar en la base de datos
    public void actualizarLugar(int id, String nombre) {
        String sql = "UPDATE lugares SET nombre = ? WHERE id = ?";
        
        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, nombre);
            ps.setInt(2, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Método para eliminar un lugar de la base de datos
    public void eliminarLugar(int id) {
        String sql = "DELETE FROM lugares WHERE id = ?";
        
        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Método para obtener los datos de un lugar según su ID
    public void obtenerLugar(int id) {
        String sql = "SELECT * FROM lugares WHERE id = ?";
        
        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                // Aquí puedes acceder a los datos del lugar y hacer algo con ellos
                String nombre = rs.getString("nombre");
                System.out.println("Lugar ID: " + id + ", Nombre: " + nombre);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

