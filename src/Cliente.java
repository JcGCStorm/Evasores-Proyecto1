public class Cliente {
    public String usuario;
    public String contrasena;
    public String nombreReal;
    public String telefono;
    public String direccion;
    public String nacionalidad;

    public Cliente(String usuario, String contrasena, String nombreReal,
            String telefono, String direccion) {
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.nombreReal = nombreReal;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public String getNombreReal() {
        return nombreReal;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }
}
