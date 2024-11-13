package Datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DAOVehiculo {

    // Método para insertar un vehículo en la base de datos con la referencia a un puesto
    public void insertarVehiculo(String modelo, int cantidadPasajeros, int numeroAsientos, int puestoId) {
        String sql = "INSERT INTO Vehiculos (modelo, cantidad_pasajeros, numero_asientos, puesto_id) VALUES (?, ?, ?, ?)";
        
        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, modelo);
            ps.setInt(2, cantidadPasajeros);
            ps.setInt(3, numeroAsientos);
            ps.setInt(4, puestoId);  // Se asume que el puesto_id es válido y existe en la tabla Puestos
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Método para actualizar un vehículo existente en la base de datos
    public void actualizarVehiculo(int id, String modelo, int cantidadPasajeros, int numeroAsientos, int puestoId) {
        String sql = "UPDATE Vehiculos SET modelo = ?, cantidad_pasajeros = ?, numero_asientos = ?, puesto_id = ? WHERE id = ?";
        
        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, modelo);
            ps.setInt(2, cantidadPasajeros);
            ps.setInt(3, numeroAsientos);
            ps.setInt(4, puestoId);  // Se actualiza el puesto asociado
            ps.setInt(5, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Método para eliminar un vehículo de la base de datos
    public void eliminarVehiculo(int id) {
        String sql = "DELETE FROM Vehiculos WHERE id = ?";
        
        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Método para obtener los datos de un vehículo según su ID
    public void obtenerVehiculo(int id) {
        String sql = "SELECT * FROM Vehiculos WHERE id = ?";
        
        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeQuery();
            // Puedes agregar el procesamiento de los resultados aquí (si necesitas mostrar o trabajar con los datos)
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

