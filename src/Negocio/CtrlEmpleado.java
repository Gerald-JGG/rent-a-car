package negocio;

import Datos.DAOEmpleado;
import Objetos.ObjEmpleado;

public class CtrlEmpleado {
    private DAOEmpleado daoEmpleado;

    public CtrlEmpleado() {
        daoEmpleado = new DAOEmpleado();
    }

    // Método para insertar un nuevo empleado
    public void insertarEmpleado(ObjEmpleado empleado) {
        daoEmpleado.insertarEmpleado(
            empleado.getCedula(),
            empleado.getNombreCompleto(),
            empleado.getCorreo(),
            empleado.getDireccion(),
            empleado.getUsuarioId()
        );
    }

    // Método para actualizar un empleado existente
    public void actualizarEmpleado(ObjEmpleado empleado) {
        daoEmpleado.actualizarEmpleado(
            empleado.getId(),
            empleado.getCedula(),
            empleado.getNombreCompleto(),
            empleado.getCorreo(),
            empleado.getDireccion()
        );
    }

    // Método para eliminar un empleado por ID
    public void eliminarEmpleado(int id) {
        daoEmpleado.eliminarEmpleado(id);
    }
}
