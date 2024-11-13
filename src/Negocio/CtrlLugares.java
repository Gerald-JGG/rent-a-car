package Negocio;

import Datos.DAOLugar;
import Objetos.ObjLugar;

public class CtrlLugares {
    private DAOLugar daoLugar;

    public CtrlLugares() {
        daoLugar = new DAOLugar();
    }

    // Método para insertar un nuevo lugar
    public void insertarLugar(ObjLugar lugar) {
        daoLugar.insertarLugar(lugar.getNombre());
    }

    // Método para actualizar un lugar existente
    public void actualizarLugar(ObjLugar lugar) {
        daoLugar.actualizarLugar(lugar.getId(), lugar.getNombre());
    }

    // Método para eliminar un lugar por ID
    public void eliminarLugar(int id) {
        daoLugar.eliminarLugar(id);
    }
}
