package negocio;

import Datos.DAOTarifa;
import Objetos.ObjTarifa;

public class CtrlTarifas {
    private DAOTarifa daoTarifa;

    public CtrlTarifas() {
        daoTarifa = new DAOTarifa();
    }

    // Método para insertar una nueva tarifa
    public void insertarTarifa(ObjTarifa tarifa) {
        daoTarifa.insertarTarifa(tarifa.getPrecio(), tarifa.getClase(), tarifa.getVehiculoId());
    }

    // Método para actualizar una tarifa existente
    public void actualizarTarifa(ObjTarifa tarifa) {
        daoTarifa.actualizarTarifa(tarifa.getId(), tarifa.getPrecio(), tarifa.getClase(), tarifa.getVehiculoId());
    }

    // Método para eliminar una tarifa por ID
    public void eliminarTarifa(int id) {
        daoTarifa.eliminarTarifa(id);
    }
}
