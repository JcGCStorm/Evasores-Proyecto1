public class ClienteFactory {

    // public Cliente creaCliente(String nacionalidad) {
    // return;
    // }

    public Cliente creaCliente(Cliente cliente, String nacionalidad) {
        if (cliente.getNacionalidad().equals("mexicano")) {
            cliente = new ClienteMexicano("Juan", "1234", "Juan Felipe",
                    "5527384932", "Melchor Ocampo");
        } else if (cliente.getNacionalidad().equals("español")) {
            cliente = new ClienteEspanol("Juan", "1234", "Juan Felipe",
                    "5527384932", "Melchor Ocampo");
        } else if (cliente.getNacionalidad().equals("estadounidense")) {
            cliente = new ClienteEstadounidense("Juan", "1234", "Juan Felipe",
                    "5527384932", "Melchor Ocampo");
        }
        return cliente;
    }
}
