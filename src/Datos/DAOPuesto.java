package Datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAOPuesto {

    // Método para insertar un nuevo puesto en la base de datos
    public void insertarPuesto(String nombre) {
        String sql = "INSERT INTO puestos (nombre) VALUES (?)";
        
        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, nombre);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Método para actualizar un puesto en la base de datos
    public void actualizarPuesto(int id, String nombre) {
        String sql = "UPDATE puestos SET nombre = ? WHERE id = ?";
        
        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, nombre);
            ps.setInt(2, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Método para eliminar un puesto de la base de datos
    public void eliminarPuesto(int id) {
        String sql = "DELETE FROM puestos WHERE id = ?";
        
        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Método para obtener los datos de un puesto según su ID
    public void obtenerPuesto(int id) {
        String sql = "SELECT * FROM puestos WHERE id = ?";
        
        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                // Aquí puedes acceder a los datos del puesto y hacer algo con ellos
                String nombre = rs.getString("nombre");
                System.out.println("Puesto ID: " + id + ", Nombre: " + nombre);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
