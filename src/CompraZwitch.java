/**
 * Clase que representa el producto "ZWitch" para "decorar" (agregarle a) el carrito.
 * Extiende de ObjetosCarrito
 */
public class CompraZwitch extends CarritoObjetos {
     /**
     * Constructor de la clase CompraZwitch
     * 
     * @param producto El carrito a decorar con una Zwitch
     */
    public CompraZwitch(Productos producto) {
        super(producto);
    }

    /**
     * Obtiene la descripción del carrito con la Zwitch
     * 
     * @return La descripción del carrito con una Nientiendo Zwitch
     */
    public String getDescripcion() {
        return producto.getDescripcion() + "Consola Nintendo Switch Neon 32 GB, ";
    }

    /**
     * Obtiene el precio del carrito con una Zwitch
     * 
     * @return El precio del carrito con Zwitch
     */
    public double getPrecio() {
        if (VistaGringo.OfertaElectronicos() == true) {
            precio = producto.getPrecio() + (7790.00 / 5) * 4;

        } else {
            precio = producto.getPrecio() + 7790.00;
        }
        return precio;

    }

     /**
     * Obtiene el codigo de barras de la Zwitch
     * 
     * @return El codigo de barras de la Zwitch
     */
    @Override
    public String getCodigoBarras() {
        return "2021. ";
    }

     /**
     * Obtiene el nombre a mostrar en el catalogo de la Zwitch
     * 
     * @return El nombre de la Zwitch
     */
    @Override
    public String getNombre() {
        return "Nientiendo Zwitch.                                           ($7,790.00)";
    }

}