import java.util.Random;

/**
 * Interfaz VistaEspañol que nos ayuda a crear la vista para un cliente con nacionalidad
 * española, esta vista es personalizada.
 */
public class VistaEspanol implements VistaCliente {

    /**
     * Esta String nos da un espacio, es decir, tal cuál la usamos para hacer una
     * separacion.
     */
    private String espacio = "==================================================================================";

    /**
     * Esta es la String del metodo {@Link ClienteVista#pciones()
     */
    private String decision = "¿Qué te gustaria hacer, tio? \n 1. Ver Catalogo. \n 2. Comprar\n" +
            " 3. Salir";
    /**
     * Esta es la String del metodo {@Link ClienteVista#opcionesCatalogo()
     */
    private String decisionCatalogo = "¿Qué te gustaria hacer ahora, tío? \n 1. Vovler\n" +
            " 2. Salir";

    /**
     * Esta es la String del metodo {@Link ClienteVista#mostrarSaludo()
     */
    private String saludo = "Hey muy buenas a toodos guaaapisismos bienvenidos a la \n" +
            "tienda CheemsMart, aquí tenemos todas las novedades del producto\n" +
            "Mexicano que tanto os gusta.";



    /**
     * El metodo mostrarSaludo() nos ayuda a dar un saludo personalizado
     * en Español de España.
     * @return un saludo personalizado.
     */
    @Override
    public String mostrarSaludo() {
        return espacio + "\n" + saludo + "\n" + espacio + "\n";
    }

    /**
     * El metodo mostrarDespedida() nos ayuda a dar una despedida personalizada
     * en Español de España.
     * @return una despedida personalizada.
     */
    @Override
    public String mostrarDespedida() {
        return "Adios, chaval \n" + espacio;
    }

    /**
     * El metodo opciones() nos ayuda a dar las opciones del menú principal
     * en Español de España.
     * @return opciones personalizadas del menu principal.
     */
    @Override
    public String opciones() {
        return decision;
    }

    /**
     * El metodo opcionesCatalogo() nos ayuda a dar las opciones del catalogo
     * en Español de España, estas opciones se diferencian de las anteriores en
     * que no muestra la opción de comprar ni la de catalogo, solo muestra la opcion 
     * para regresar al menu anterior y para salir del programam.
     * @return las opciones del catalogo personalizadas.
     */
    @Override
    public String opcionesCatalogo() {
        return decisionCatalogo;
    }

    /**
     * El metodo completarCompra() nos ayuda a dar las opciones que se deben de elegir
     * para completar la compra en Español de España.
     * @return las instrucciones personalizadas para completar la compra.
     */
    @Override
    public String completarCompra() {
        return "¿Deseas continuar con el pago?. (sip/nop)";
    }

    /**
     * El metodo mostrarOferta() nos ayuda a decidir si hay una oferta o no y de haberla,
     * la imprime y hace los descuentos corresponientes a la oferta, las pone de manera 
     * aleatoria en Español de España.
     * @return un boolean que nos dice si hay oferta o no y personalizada.
     */
    @Override
    public boolean mostrarOferta() {
        return OfertaElectrodomesticos();
    }

    /**
     * Este metodo nos genera un boolean aleatorio, de ser true imprime el mensaje
     * de ser false no imprime nada.
     * @return un boolean que nos dice si la oferya está activa o no
     */
    public static Boolean OfertaElectrodomesticos() {
        Random random = new Random();
        boolean imprimirMensaje = random.nextBoolean();

        if (imprimirMensaje) {
            System.out.println("Que no se te pase la oferta tio, tenemos 20% de descuento en electrodomesticos");
        }

        return imprimirMensaje;
    }



    /**
     * El metodo darFechaEntrega() nos ayuda a dar una posible fecha de entrega que
     * pone los dias de manera aleatoria en Español de España.
     * @return una fecha de entrega aproximada y personalizada.
     */
    @Override
    public String darFechaEntrega() {
        Random random = new Random();
        int dias = random.nextInt(15);           
        return "Tus productos van a todo gas, llegarán aproximadamente en " + dias + " dias chaval.";
      }
  }


