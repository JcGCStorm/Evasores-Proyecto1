public class VistaEspanol implements VistaCliente {

    private String espacio = "==================================================================";

    private String decision = "¿Qué te gustaria hacer, tio? \n 1. Comprar.\n 2. Salir";

    private String productos() {
        return "Hey muy buenas a toodos guapisismos bienvenidos a la \n" +
                "tienda CheemsMart, aquí tenemos todas las novedades del producto\n" +
                "Mexicano que tanto os gusta";
    }

    @Override
    public String mostrarInterfaz() {
        return espacio + "\n" + productos() + "\n" + espacio + "\n" + decision;
    }
}
