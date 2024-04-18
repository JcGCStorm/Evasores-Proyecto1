/**
 * Clase ClienteEstadounidense, que nos ayuda a crear clientes estadounidenses
 */
public class ClienteEstadounidense implements Cliente {

    String usuario; // "Arthur";
    String contrasena; // "333221";
    String nombreReal; // "Arthur Morgan";
    String telefono; // "78966652";
    String direccion; // "56 St. , Austin, Texas, U.S.A";
    String nacionalidad = "Estadounidense"; // "Estadounidense";
    int id; // 1899
    CuentaBancaria cuentaBancaria;

    /**
     * El constructor del cliente estadounidense, recibe todos los datos del cliente
     * @param usuario 
     * @param contrasena 
     * @param nombreReal 
     * @param telefono
     * @param direccion
     * @param nacionalidad
     * @param id
     * @param cuentaBancaria
     */
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

    /**
     * Metodo getUsuario que nos devuelve el usuario del cliente
     * @return el nombre de usuario del cliente.
     */
    @Override
    public String getUsuario() {
        return usuario;
    }

    /**
     * Metodo getContrasena que nos devuelve la contraseña del cliente
     * @return la contraseña del cliente.
     */
    @Override
    public String getContrasena() {
        return contrasena;
    }

    /**
     * Metodo getNombreReal que nos devuelve el nombre real del cliente
     * @return el nombre del cliente.
     */
    @Override
    public String getNombreReal() {
        return nombreReal;
    }

    /**
     * Metodo getTelefono que nos devuelve el telefono del cliente
     * @return el telefono del cliente.
     */
    @Override
    public String getTelefono() {
        return telefono;
    }

    /**
     * Metodo getDireccion que nos devuelve la direccion del cliente
     * @return la direccion del cliente.
     */
    @Override
    public String getDireccion() {
        return direccion;
    }

    /**
     * Metodo getNacionalidad que nos devuelve la nacionalidad del cliente
     * @return la nacionalidad del cliente.
     */
    @Override
    public String getNacionalidad() {
        return nacionalidad;
    }

    /**
     * Metodo getCuentaBancaria que nos devuelve la cuenta bancaria asociada al cliente.
     * @return CuentaBancaria asociada al cliente.
     */
    @Override
    public CuentaBancaria getCuentaBancaria() {
        return cuentaBancaria;
    }

     /**
     * Metodo getID que nos devuelve el ID del cliente.
     * @return el identificador del cliente.
     */
    @Override
    public int getID() {
        return id;
    }

}
