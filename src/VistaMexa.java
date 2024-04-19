import java.util.Random;

/**
 * Interfaz VistaMexa que nos ayuda a crear la vista para un cliente con nacionalidad
 * mexicana, esta vista es personalizada.
 */
public class VistaMexa implements VistaCliente {
    /**
     * Esta String nos da un espacio, es decir, tal cuál la usamos para hacer una
     * separacion.
     */
    private String espacio = "==================================================================================";
    /**
     * Esta es la String del metodo {@Link ClienteVista#opciones()
     */
    private String decision = "¿Qué quieres hacer apá? \n 1. Nada más ando viendo gracias. (Ver catalogo)." +
            "\n 2. Hacer el mandado (Comprar) \n 3. Escapar de LATAM (Salir del programa)";
    /**
     * Esta es la String del metodo {@Link ClienteVista#opcionesCatalogo()
     */
    private String decisionCatalogo = "¿Qué quieres hacer ahora, apá? \n 1. Al rato paso (Volver atrás)." +
            "\n 2. Escapar de LATAM (Salir del programa)";

    /**
     * Esta es la String del metodo {@Link ClienteVista#mostrarSaludo()
     */
    private String saludo = "Pasele güerita, acá tenemos de todo, casi como en el centro pero desde la comodidad\n" +
            "de su linda casa. Espero que encuentre lo que busca aquí en CheemSmart, recuerde que\n" +
            "hoy no fiamos pero mañana si, pregunte sin miedo.";


    /**
     * El metodo mostrarSaludo() nos ayuda a dar un saludo personalizado
     * en Español Latino con muchos modismos.
     * @return un saludo personalizado.
     */
    @Override
    public String mostrarSaludo() {
        return espacio + "\n" + saludo + "\n" + espacio + "\n";
    }

    /**
     * El metodo mostrarDespedida() nos ayuda a dar una despedida personalizada
     * en Español latino con muchos modismos.
     * @return una despedida personalizada.
     */
    @Override
    public String mostrarDespedida() {
        return "Orale pues, ahí nos vidrios. \n" + espacio;
    }

    /**
     * El metodo opciones() nos ayuda a dar las opciones del menú principal
     * en Español latino con muchos modismos.
     * @return opciones personalizadas del menu principal.
     */
    public String opciones() {
        return decision;
    }

    /**
     * El metodo opcionesCatalogo() nos ayuda a dar las opciones del catalogo
     * en Español latino, estas opciones se diferencian de las anteriores en
     * que no muestra la opción de comprar ni la de catalogo, solo muestra la opcion 
     * para regresar al menu anterior y para salir del programa en Español latino.
     * @return las opciones del catalogo personalizadas.
     */
    @Override
    public String opcionesCatalogo() {
        return decisionCatalogo;
    }

    /**
     * El metodo completarCompra() nos ayuda a dar las opciones que se deben de elegir
     * para completar la compra en Español latino.
     * @return las instrucciones personalizadas para completar la compra.
     */
    @Override
    public String completarCompra() {
        return "¿Deseas proceder al pago? (simon/nel)";
    }

    /**
     * El metodo mostrarOferta() nos ayuda a decidir si hay una oferta o no y de haberla,
     * la imprime y hace los descuentos corresponientes a la oferta, las pone de manera 
     * aleatoria en Español latino.
     * @return un boolean que nos dice si hay oferta o no y personalizada.
     */
    @Override
    public boolean mostrarOferta() {    
        return OfertaAlimentos();
    }

    /**
     * Este metodo nos genera un boolean aleatorio, de ser true imprime el mensaje
     * de ser false no imprime nada.
     * @return un boolean que nos dice si la oferta está activa o no
     */
    public static Boolean OfertaAlimentos() {
        Random random = new Random();
        boolean imprimirMensaje = random.nextBoolean();

        if (imprimirMensaje) {
            System.out.println("Iñor, tenemos un 25 % de descuento en todos los alimentos :D");
        }

        return imprimirMensaje;
    }

    /**
     * El metodo darFechaEntrega() nos ayuda a dar una posible fecha de entrega que
     * pone los dias de manera aleatoria en Español Latino.
     * @return una fecha de entrega aproximada y personalizada.
     */
    @Override
    public String darFechaEntrega() {
        Random random = new Random();
        int dias = random.nextInt(15);           
        return "Puessss tus productos llegarán en aproximadamente " + dias + " dias si Dios quiere.";
      }
}
