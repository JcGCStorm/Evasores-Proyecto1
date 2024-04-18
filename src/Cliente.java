/**
 * Interfaz Cliente, la cuál nos ayuda a crear clientes, dandonos los metodos que 
 * deben de tener todos los clientes.
 */
public interface Cliente {

    /**
     * Metodo getUsuario que nos devuelve el usuario del cliente
     * @return el nombre de usuario del cliente.
     */
    String getUsuario();

    /**
     * Metodo getContrasena que nos devuelve la contraseña del cliente
     * @return la contraseña del cliente.
     */
    String getContrasena();

    /**
     * Metodo getNombreReal que nos devuelve el nombre real del cliente
     * @return el nombre del cliente.
     */
    String getNombreReal();

      /**
     * Metodo getTelefono que nos devuelve el telefono del cliente
     * @return el telefono del cliente.
     */
    String getTelefono();

      /**
     * Metodo getDireccion que nos devuelve la direccion del cliente
     * @return la direccion del cliente.
     */
    String getDireccion();

      /**
     * Metodo getNacionalidad que nos devuelve la nacionalidad del cliente
     * @return la nacionalidad del cliente.
     */
    String getNacionalidad();

      /**
     * Metodo getID que nos devuelve el ID del cliente.
     * @return el identificador del cliente.
     */
    int getID();

    /**
     * Metodo getCuentaBancaria que nos devuelve la cuenta bancaria asociada al cliente.
     * @return CuentaBancaria asociada al cliente.
     */
    CuentaBancaria getCuentaBancaria();
}
