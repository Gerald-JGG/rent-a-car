package Negocio;


import Objetos.ObjVehiculo;

public interface IVehiculo {

    void insertarVehiculo(ObjVehiculo vehiculo);

    void actualizarVehiculo(ObjVehiculo vehiculo);

    void eliminarVehiculo(int id);

    ObjVehiculo obtenerVehiculo(int id);
}
