/**
 * Interfaz VistaCliente que nos dá todos los metodos que debe de 
 * tener la vista de un cliente según su nacionalidad.
 */
public interface VistaCliente {

    /**
     * El metodo mostrarSaludo() nos ayuda a dar un saludo personalizado
     * en el idioma del cliente según su nacionalidad .
     * @return un saludo personalizado.
     */
    public String mostrarSaludo();

    /**
     * El metodo mostrarDespedida() nos ayuda a dar una despedida personalizada
     * en el idioma del cliente basado en su nacionalidad.
     * @return una despedida personalizada.
     */
    public String mostrarDespedida();

    /**
     * El metodo opciones() nos ayuda a dar las opciones del menú principal
     * en el idioma del cliente según su nacionalidad.
     * @return opciones personalizadas del menu principal.
     */
    public String opciones();

    /**
     * El metodo opcionesCatalogo() nos ayuda a dar las opciones del catalogo
     * en el idioma del cliente según su nacionalidad, estas opciones se diferencian
     * de las anteriores en que no muestra la opción de comprar ni la de catalogo, solo
     * muestra la opcion para regresar al menu anterior y para salir del programam.
     * @return las opciones del catalogo personalizadas segun la nacionalidad del cliente.
     */
    public String opcionesCatalogo();

    /**
     * El metodo completarCompra() nos ayuda a dar las opciones que se deben de elegir
     * para completar la compra en el idioma del cliente según su nacionalidad.
     * @return las instrucciones personalizadas para completar la compra.
     */
    public String completarCompra();

    /**
     * El metodo darFechaEntrega() nos ayuda a dar una posible fecha de entrega que
     * pone los dias de manera aleatoria en el idioma del cliente según su nacionalidad.
     * @return una fecha de entrega aproximada y personalizada.
     */
    public String darFechaEntrega();

    /**
     * El metodo mostrarOferta() nos ayuda a decidir si hay una oferta o no y de haberla,
     * la imprime y hace los descuentos corresponientes a la oferta, las pone de manera 
     * aleatoria en el idioma del cliente según su nacionalidad.
     * @return un boolean que nos dice si hay oferta o no y personalizada.
     */
    public boolean mostrarOferta();
}
