package Negocio;


import Objetos.ObjPuesto;

public interface IPuesto {

    void insertarPuesto(ObjPuesto puesto);

    void actualizarPuesto(ObjPuesto puesto);

    void eliminarPuesto(int id);

    ObjPuesto obtenerPuesto(int id);
}
