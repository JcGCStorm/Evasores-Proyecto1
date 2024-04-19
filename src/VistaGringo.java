import java.util.Random;

/**
 * Interfaz VistaGringo que nos ayuda a crear la vista para un cliente con nacionalidad
 * estadounidense, esta vista es personalizada.
 */
public class VistaGringo implements VistaCliente {

    /**
     * Esta String nos da un espacio, es decir, tal cuál la usamos para hacer una
     * separacion.
     */
    private String espacio = "==================================================================================";
    /**
     * Esta es la String del metodo {@Link ClienteVista#opciones()
     */
    private String decision = "What would you like to do? \n 1. View catalog.\n 2. Buy." +
            "                     \n 3. Quit\n";
     /**
     * Esta es la String del metodo {@Link ClienteVista#opcionesCatalogo()
     */
    private String decisionCatalogo = "What would you like to do? \n 1. Go Back. \n 2. Quit";

     /**
     * Esta es la String del metodo {@Link ClienteVista#mostrarSaludo()
     */
    private String saludo = "Welcome dear american citizens, you're entering the great frijolero Store\n" +
            "named CheemsMart, here we have the greatest products of our mexican neighbors\n" +
            "be free to choose any product that you want, they don't sell weapons unfortunately\n" +
            "but they sell great electronics";



    /**
     * El metodo mostrarSaludo() nos ayuda a dar un saludo personalizado
     * en Inglés.
     * @return un saludo personalizado.
     */
    @Override
    public String mostrarSaludo() {
        return espacio + "\n" + saludo + "\n" + espacio + "\n";
    }

    /**
     * El metodo mostrarDespedida() nos ayuda a dar una despedida personalizada
     * en Inglés.
     * @return una despedida personalizada.
     */
    @Override
    public String mostrarDespedida() {
        return "Goodbye.\n" + espacio;
    }

    /**
     * El metodo opciones() nos ayuda a dar las opciones del menú principal
     * en Inglés.
     * @return opciones personalizadas del menu principal.
     */
    @Override
    public String opciones() {
        return decision;
    }

    /**
     * El metodo opcionesCatalogo() nos ayuda a dar las opciones del catalogo
     * en Inglés, estas opciones se diferencian de las anteriores en
     * que no muestra la opción de comprar ni la de catalogo, solo muestra la opcion 
     * para regresar al menu anterior y para salir del programa en inglés.
     * @return las opciones del catalogo personalizadas.
     */
    @Override
    public String opcionesCatalogo() {
        return decisionCatalogo;
    }

    /**
     * El metodo completarCompra() nos ayuda a dar las opciones que se deben de elegir
     * para completar la compra en Inglés.
     * @return las instrucciones personalizadas para completar la compra.
     */
    @Override
    public String completarCompra() {
        return "You want to proceed with the payment? (yes/no)";
    }

    /**
     * El metodo mostrarOferta() nos ayuda a decidir si hay una oferta o no y de haberla,
     * la imprime y hace los descuentos corresponientes a la oferta, las pone de manera 
     * aleatoria en Inglés.
     * @return un boolean que nos dice si hay oferta o no y personalizada.
     */
    @Override
    public boolean mostrarOferta() {
        return OfertaElectronicos();
    }

    /**
     * Este metodo nos genera un boolean aleatorio, de ser true imprime el mensaje
     * de ser false no imprime nada.
     * @return un boolean que nos dice si la oferta está activa o no
     */
    public static Boolean OfertaElectronicos() {
        Random random = new Random();
        boolean imprimirMensaje = random.nextBoolean();

        if (imprimirMensaje) {
            System.out.println("We have a 20% discount on all electronics!!!");
        }

        return imprimirMensaje;
    }



    /**
     * El metodo darFechaEntrega() nos ayuda a dar una posible fecha de entrega que
     * pone los dias de manera aleatoria en Inglés.
     * @return una fecha de entrega aproximada y personalizada.
     */
    @Override
    public String darFechaEntrega() {
        Random random = new Random();
        int dias = random.nextInt(15);           
        return "Your products will arrive in approximately " + dias + " days.";
      }
}
