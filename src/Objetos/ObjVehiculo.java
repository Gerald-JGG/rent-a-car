package Objetos;

public class ObjVehiculo {
    private int id;
    private String modelo;
    private int cantidadPasajeros;
    private int numeroAsientos;
    private int puestoId;

    // Constructor sin ID, para nuevos vehículos (por ejemplo, al insertar en la base de datos)
    public ObjVehiculo(String modelo, int cantidadPasajeros, int numeroAsientos, int puestoId) {
        this.modelo = modelo;
        this.cantidadPasajeros = cantidadPasajeros;
        this.numeroAsientos = numeroAsientos;
        this.puestoId = puestoId;
    }

    // Constructor con ID, para vehículos existentes (por ejemplo, al actualizar o consultar)
    public ObjVehiculo(int id, String modelo, int cantidadPasajeros, int numeroAsientos, int puestoId) {
        this.id = id;
        this.modelo = modelo;
        this.cantidadPasajeros = cantidadPasajeros;
        this.numeroAsientos = numeroAsientos;
        this.puestoId = puestoId;
    }

    // Getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    public void setCantidadPasajeros(int cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public int getNumeroAsientos() {
        return numeroAsientos;
    }

    public void setNumeroAsientos(int numeroAsientos) {
        this.numeroAsientos = numeroAsientos;
    }

    public int getPuestoId() {
        return puestoId;
    }

    public void setPuestoId(int puestoId) {
        this.puestoId = puestoId;
    }
}
