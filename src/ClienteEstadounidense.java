public class ClienteEstadounidense implements Cliente {

    String usuario; // "Arthur";
    String contrasena; // "333221";
    String nombreReal; // "Arthur Morgan";
    String telefono; // "78966652";
    String direccion; // "56 St. , Austin, Texas, U.S.A";
    String nacionalidad; // "Estadounidense";
    int id; // 1899
    CuentaBancaria cuentaBancaria;

    public ClienteEstadounidense(String usuario, String contrasena, String nombreReal, String telefono,
            String direccion, String nacionalidad, int id, CuentaBancaria cuentaBancaria) {
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.nombreReal = nombreReal;
        this.telefono = telefono;
        this.direccion = direccion;
        this.nacionalidad = nacionalidad;
        this.id = id;
        this.cuentaBancaria = cuentaBancaria;
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
    public CuentaBancaria getCuentaBancaria() {
        return cuentaBancaria;
    }

    @Override
    public int getID() {
        return id;
    }

}
