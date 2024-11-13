package Negocio;


import Objetos.ObjLugar;

public interface ILugar {

    void insertarLugar(ObjLugar lugar);

    void actualizarLugar(ObjLugar lugar);

    void eliminarLugar(int id);

    ObjLugar obtenerLugar(int id);
}
