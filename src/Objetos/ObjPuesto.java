package Objetos;

public class ObjPuesto {
    private int id;
    private String nombre;

    // Constructor sin ID, para nuevos puestos
    public ObjPuesto(String nombre) {
        this.nombre = nombre;
    }

    // Constructor con ID, para puestos existentes
    public ObjPuesto(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    // Getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
