public class ClienteMexicano implements Cliente {

    String usuario; // "JuanHorse938";
    String contrasena; // "1234";
    String nombreReal; // "Juan Lopez";
    String telefono; // "5533456798";
    String direccion; // "Ciudad de Mexico, Venustiano Carranza Número 24, Lote 3, mzn 23";
    String nacionalidad; // "Mexicano";
    int id; // 8423
    CuentaBancaria cuentaBancaria;

    public ClienteMexicano(String usuario, String contrasena, String nombreReal, String telefono,
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
