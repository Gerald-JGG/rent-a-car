package Datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAOTarifa {

    // Método para insertar una nueva tarifa en la base de datos
    public void insertarTarifa(double precio, String clase, int vehiculoId) {
        String sql = "INSERT INTO tarifas (precio, clase, vehiculo_id) VALUES (?, ?, ?)";
        
        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setDouble(1, precio);
            ps.setString(2, clase);
            ps.setInt(3, vehiculoId);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Método para actualizar los datos de una tarifa en la base de datos
    public void actualizarTarifa(int id, double precio, String clase, int vehiculoId) {
        String sql = "UPDATE tarifas SET precio = ?, clase = ?, vehiculo_id = ? WHERE id = ?";
        
        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setDouble(1, precio);
            ps.setString(2, clase);
            ps.setInt(3, vehiculoId);
            ps.setInt(4, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Método para eliminar una tarifa de la base de datos
    public void eliminarTarifa(int id) {
        String sql = "DELETE FROM tarifas WHERE id = ?";
        
        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Método para obtener los datos de una tarifa según su ID
    public void obtenerTarifa(int id) {
        String sql = "SELECT * FROM tarifas WHERE id = ?";
        
        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                // Aquí puedes acceder a los datos de la tarifa y hacer algo con ellos
                double precio = rs.getDouble("precio");
                String clase = rs.getString("clase");
                int vehiculoId = rs.getInt("vehiculo_id");
                System.out.println("Tarifa ID: " + id + ", Precio: " + precio + ", Clase: " + clase + ", Vehículo ID: " + vehiculoId);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}