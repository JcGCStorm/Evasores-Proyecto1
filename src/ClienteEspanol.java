public class ClienteEspanol implements Cliente {
// Para este ejemplo esos son los valores que pusimos.
   String usuario;              //"CdeCiencia";
   String contrasena;           // "vivaEspaña";
   String nombreReal;           // "Samuel de Luque";
   String telefono;             // "+34-83494854";
   String direccion;            // "Avenida YT, calzada mojang número 22, Andorra";
   String nacionalidad;         // "Español";
   int id;                       // 777


    public ClienteEspanol(String usuario, String contrasena, String nombreReal, String telefono,
                          String direccion, String nacionalidad, int id){
        this.usuario      = usuario;
        this.contrasena   = contrasena;
        this.nombreReal   = nombreReal;
        this.telefono     = telefono;
        this.direccion    = direccion;
        this.nacionalidad = nacionalidad;
        this.id           = id;
    }

    @Override
    public String getUsuario() {
        return usuario;
    }

    @Override
    public String getContrasena() {
        return contrasena;
    }

    @Override
    public String getNombreReal() {
        return nombreReal;
    }

    @Override
    public String getTelefono() {
        return telefono;
    }

    @Override
    public String getDireccion() {
        return direccion;
    }

    @Override
    public String getNacionalidad() {
        return nacionalidad;
    }

    @Override
    public int getID(){
        return id;
    }

}
