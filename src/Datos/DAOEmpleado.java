package Datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAOEmpleado {

    // Método para insertar un nuevo empleado en la base de datos
    public void insertarEmpleado(String cedula, String nombreCompleto, String correo, String direccion, int usuarioId) {
        String sql = "INSERT INTO empleados (cedula, nombre_completo, correo, direccion, usuario_id) VALUES (?, ?, ?, ?, ?)";
        
        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, cedula);
            ps.setString(2, nombreCompleto);
            ps.setString(3, correo);
            ps.setString(4, direccion);
            ps.setInt(5, usuarioId);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Método para actualizar los datos de un empleado en la base de datos
    public void actualizarEmpleado(int id, String cedula, String nombreCompleto, String correo, String direccion) {
        String sql = "UPDATE empleados SET cedula = ?, nombre_completo = ?, correo = ?, direccion = ? WHERE id = ?";
        
        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, cedula);
            ps.setString(2, nombreCompleto);
            ps.setString(3, correo);
            ps.setString(4, direccion);
            ps.setInt(5, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Método para eliminar un empleado de la base de datos
    public void eliminarEmpleado(int id) {
        String sql = "DELETE FROM empleados WHERE id = ?";
        
        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Método para obtener los datos de un empleado según su ID
    public void obtenerEmpleado(int id) {
        String sql = "SELECT * FROM empleados WHERE id = ?";
        
        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                // Aquí puedes acceder a los datos del empleado y hacer algo con ellos
                String cedula = rs.getString("cedula");
                String nombreCompleto = rs.getString("nombre_completo");
                String correo = rs.getString("correo");
                String direccion = rs.getString("direccion");
                System.out.println("Empleado ID: " + id + ", Cédula: " + cedula + ", Nombre: " + nombreCompleto + ", Correo: " + correo + ", Dirección: " + direccion);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
