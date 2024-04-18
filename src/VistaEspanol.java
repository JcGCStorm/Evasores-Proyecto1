import java.util.Random;

public class VistaEspanol implements VistaCliente {

    private String espacio = "==================================================================================";

    private String decision = "¿Qué te gustaria hacer, tio? \n 1. Ver Catalogo. \n 2. Comprar\n" +
            " 3. Salir";
    private String decisionCatalogo = "¿Qué te gustaria hacer ahora, tío? \n 1. Vovler\n" +
            " 2. Salir";

    private String saludo = "Hey muy buenas a toodos guaaapisismos bienvenidos a la \n" +
            "tienda CheemsMart, aquí tenemos todas las novedades del producto\n" +
            "Mexicano que tanto os gusta.";

    @Override
    public String mostrarSaludo() {
        return espacio + "\n" + saludo + "\n" + espacio + "\n";
    }

    @Override
    public String mostrarDespedida() {
        return "Ostias tío \n" + espacio;
    }

    @Override
    public String opciones() {
        return decision;
    }

    @Override
    public String opcionesCatalogo() {
        return decisionCatalogo;
    }

    @Override
    public String completarCompra() {
        return "¿Deseas continuar con el pago?. (si/no)";
    }

    @Override
    public boolean mostrarOferta() {
        return OfertaElectrodomesticos();
    }

    public static Boolean OfertaElectrodomesticos() {
        Random random = new Random();
        boolean imprimirMensaje = random.nextBoolean();

        if (imprimirMensaje) {
            System.out.println("Que no se te pase la oferta tio, tenemos 20% de descuento en electrodomesticos");
        }

        return imprimirMensaje;
    }

}
