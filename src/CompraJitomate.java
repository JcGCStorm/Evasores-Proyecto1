/**
 * Clase que representa el producto "Jitomate" para "decorar" (agregarle a) el carrito.
 * Extiende de ObjetosCarrito
 */
public class CompraJitomate extends CarritoObjetos {
    /**
     * Constructor de la clase CompraJitomate
     * 
     * @param producto El carrito a decorar con jitomate
     */
    public CompraJitomate(Productos producto) {
        super(producto);
    }

    /**
     * Obtiene la descripción del carrito con el jitomate
     * 
     * @return La descripción del carrito con jitomate
     */
    public String getDescripcion() {
        return producto.getDescripcion() + "Jitomate,";
    }

     /**
     * Obtiene el precio del carrito con el jitomate
     * 
     * @return El precio del carrito con el jitomate
     */
    public double getPrecio() {
        if (VistaMexa.OfertaAlimentos() == true) {
            precio = producto.getPrecio() + (39.90 / 4) * 3;

        } else {
            precio = producto.getPrecio() + 39.90;
        }
        return precio;
    }

    /**
     * Obtiene el codigo de barras del jitomate
     * 
     * @return El codigo de barras del jitomate
     */
    @Override
    public String getCodigoBarras() {
        return "1672. ";
    }

    /**
     * Obtiene el nombre a mostrar en el catalogo del jitomate
     * 
     * @return El nombre del jitomate
     */
    @Override
    public String getNombre() {
        return "1 kg de Jitomate.                                            ($39.90)";
    }

}
