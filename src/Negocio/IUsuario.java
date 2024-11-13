package Negocio;


import Objetos.ObjUsuario;

public interface IUsuario {

    void insertarUsuario(ObjUsuario usuario);

    void actualizarUsuario(ObjUsuario usuario);

    void eliminarUsuario(int id);

    ObjUsuario obtenerUsuario(int id);
}
