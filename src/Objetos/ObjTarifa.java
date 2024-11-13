package Objetos;

public class ObjTarifa {
    private int id;
    private double precio;
    private String clase;
    private int vehiculoId;

    // Constructor sin ID, para nuevas tarifas
    public ObjTarifa(double precio, String clase, int vehiculoId) {
        this.precio = precio;
        this.clase = clase;
        this.vehiculoId = vehiculoId;
    }

    // Constructor con ID, para tarifas existentes
    public ObjTarifa(int id, double precio, String clase, int vehiculoId) {
        this.id = id;
        this.precio = precio;
        this.clase = clase;
        this.vehiculoId = vehiculoId;
    }

    // Getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public int getVehiculoId() {
        return vehiculoId;
    }

    public void setVehiculoId(int vehiculoId) {
        this.vehiculoId = vehiculoId;
    }
}
