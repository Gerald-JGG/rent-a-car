package negocio;

import Datos.DAOPuesto;
import Objetos.ObjPuesto;

public class CtrlPuestos {
    private DAOPuesto daoPuesto;

    public CtrlPuestos() {
        daoPuesto = new DAOPuesto();
    }

    // Método para insertar un nuevo puesto
    public void insertarPuesto(ObjPuesto puesto) {
        daoPuesto.insertarPuesto(puesto.getNombre());
    }

    // Método para actualizar un puesto existente
    public void actualizarPuesto(ObjPuesto puesto) {
        daoPuesto.actualizarPuesto(puesto.getId(), puesto.getNombre());
    }

    // Método para eliminar un puesto por ID
    public void eliminarPuesto(int id) {
        daoPuesto.eliminarPuesto(id);
    }
}
