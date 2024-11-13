package Negocio;


import Objetos.ObjEmpleado;

public interface IEmpleado {

    void insertarEmpleado(ObjEmpleado empleado);

    void actualizarEmpleado(ObjEmpleado empleado);

    void eliminarEmpleado(int id);

    ObjEmpleado obtenerEmpleado(int id);
}
