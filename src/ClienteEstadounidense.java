public class ClienteEstadounidense implements Cliente {

    @Override
    public String getUsuario() {
        return "Arthur";
    }

    @Override
    public String getContrasena() {
        return "333221";
    }

    @Override
    public String getNombreReal() {
        return "Arthur Morgan";
    }

    @Override
    public String getTelefono() {
        return "78966652";
    }

    @Override
    public String getDireccion() {
        return "56 St. , Austin, Texas, U.S.A";
    }

    @Override
    public String getNacionalidad() {
        return "Estadounidense";
    }

}
