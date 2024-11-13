package negocio;

import Datos.DAOVehiculo;
import Objetos.ObjVehiculo;

public class CtrlVehiculos {
    private DAOVehiculo daoVehiculo;

    public CtrlVehiculos() {
        daoVehiculo = new DAOVehiculo();
    }

    // Método para insertar un nuevo vehículo
    public void insertarVehiculo(ObjVehiculo vehiculo) {
        daoVehiculo.insertarVehiculo(
            vehiculo.getModelo(),
            vehiculo.getCantidadPasajeros(),
            vehiculo.getNumeroAsientos(),
            vehiculo.getPuestoId()
        );
    }

    // Método para actualizar un vehículo existente
    public void actualizarVehiculo(ObjVehiculo vehiculo) {
        daoVehiculo.actualizarVehiculo(
            vehiculo.getId(),
            vehiculo.getModelo(),
            vehiculo.getCantidadPasajeros(),
            vehiculo.getNumeroAsientos(),
            vehiculo.getPuestoId()
        );
    }

    // Método para eliminar un vehículo por ID
    public void eliminarVehiculo(int id) {
        daoVehiculo.eliminarVehiculo(id);
    }
}
