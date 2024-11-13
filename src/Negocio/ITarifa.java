package Negocio;


import Objetos.ObjTarifa;

public interface ITarifa {

    void insertarTarifa(ObjTarifa tarifa);

    void actualizarTarifa(ObjTarifa tarifa);

    void eliminarTarifa(int id);

    ObjTarifa obtenerTarifa(int id);
}
