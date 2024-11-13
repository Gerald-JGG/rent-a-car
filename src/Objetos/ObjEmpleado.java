package Objetos;

public class ObjEmpleado {
    private int id;
    private String cedula;
    private String nombreCompleto;
    private String correo;
    private String direccion;
    private int usuarioId;

    // Constructor sin ID, para nuevos empleados
    public ObjEmpleado(String cedula, String nombreCompleto, String correo, String direccion, int usuarioId) {
        this.cedula = cedula;
        this.nombreCompleto = nombreCompleto;
        this.correo = correo;
        this.direccion = direccion;
        this.usuarioId = usuarioId;
    }

    // Constructor con ID, para empleados existentes
    public ObjEmpleado(int id, String cedula, String nombreCompleto, String correo, String direccion, int usuarioId) {
        this.id = id;
        this.cedula = cedula;
        this.nombreCompleto = nombreCompleto;
        this.correo = correo;
        this.direccion = direccion;
        this.usuarioId = usuarioId;
    }

    // Getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
    }
}
