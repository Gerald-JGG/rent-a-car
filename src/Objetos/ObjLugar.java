package Objetos;

public class ObjLugar {
    private int id;
    private String nombre;

    // Constructor sin ID, para nuevos lugares
    public ObjLugar(String nombre) {
        this.nombre = nombre;
    }

    // Constructor con ID, para lugares existentes
    public ObjLugar(int id, String nombre) {
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
