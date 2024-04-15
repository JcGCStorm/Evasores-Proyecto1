public class ClienteMexicano implements Cliente {

    @Override
    public String getUsuario() {
        return "JuanHorse938";
    }

    @Override
    public String getContrasena() {
        return "1234";
    }

    @Override
    public String getNombreReal() {
        return "Juan Lopez";
    }

    @Override
    public String getTelefono() {
        return "33456798";
    }

    @Override
    public String getDireccion() {
        return "Ciudad de Mexico, Venustiano Carranza Número 24, Lote 3, mzn 23";
    }

    @Override
    public String getNacionalidad() {
        return "Mexicano";
    }
}
