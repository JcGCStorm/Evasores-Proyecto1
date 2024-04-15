public class ClienteEspanol implements Cliente {

    @Override
    public String getUsuario() {
        return "CdeCiencia";
    }

    @Override
    public String getContrasena() {
        return "vivaEspaña";
    }

    @Override
    public String getNombreReal() {
        return "Samuel de Luque";
    }

    @Override
    public String getTelefono() {
        return "+34-83494854";
    }

    @Override
    public String getDireccion() {
        return "Avenida YT, calzada mojang número 22, Andorra";
    }

    @Override
    public String getNacionalidad() {
        return "Español";
    }

}
