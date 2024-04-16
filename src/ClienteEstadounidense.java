public class ClienteEstadounidense implements Cliente {

   String usuario;              //"Arthur";
   String contrasena;           // "333221";
   String nombreReal;           // "Arthur Morgan";
   String telefono;             // "78966652";
   String direccion;            // "56 St. , Austin, Texas, U.S.A";
   String nacionalidad;         // "Estadounidense";
   int id;                      // 1899 


    public ClienteEstadounidense(String usuario, String contrasena, String nombreReal, String telefono,
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

    public int getID(){
        return id;
    }

}
