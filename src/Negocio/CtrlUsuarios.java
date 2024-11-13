package negocio;

import Datos.DAOUsuario;
import Objetos.ObjUsuario;
import java.util.List;

public class CtrlUsuarios {
    private DAOUsuario daoUsuario;

    public CtrlUsuarios() {
        daoUsuario = new DAOUsuario();
    }

    // Método para insertar un nuevo usuario
    public void insertarUsuario(ObjUsuario usuario) {
        daoUsuario.insertarUsuario(usuario.getNombre(), usuario.getCorreo(), usuario.getContraseña(), usuario.getRol());
    }

    // Método para actualizar un usuario existente
    public void actualizarUsuario(ObjUsuario usuario) {
        daoUsuario.actualizarUsuario(usuario.getId(), usuario.getNombre(), usuario.getCorreo(), usuario.getContraseña(), usuario.getRol());
    }

    // Método para eliminar un usuario por ID
    public void eliminarUsuario(int id) {
        daoUsuario.eliminarUsuario(id);
    }
}
