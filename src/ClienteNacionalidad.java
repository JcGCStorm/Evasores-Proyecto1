public class ClienteNacionalidad {
    private ClienteFactory factory;

    public ClienteNacionalidad(ClienteFactory factory) {
        this.factory = factory;
    }

    public Cliente llamaCliente(String nacionalidad) {
        Cliente cliente = new Cliente(nacionalidad, nacionalidad, nacionalidad, nacionalidad, nacionalidad);
        cliente = factory.creaCliente(cliente, nacionalidad);
        return cliente;
    }
}
