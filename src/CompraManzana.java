/**
 * Clase que representa el producto "Manzana" para "decorar" (agregarle a) el carrito.
 * Extiende de ObjetosCarrito
 */
public class CompraManzana extends CarritoObjetos {
     /**
     * Constructor de la clase CompraManzana
     * 
     * @param producto El carrito a decorar con jitomate
     */
    public CompraManzana(Productos producto) {
        super(producto);
    }

   /**
     * Obtiene la descripción del carrito con la manzana
     * 
     * @return La descripción del carrito con manzana
     */
    public String getDescripcion() {
        return producto.getDescripcion() + "Manzana,";
    }

    /**
     * Obtiene el precio del carrito con la Manzana
     * 
     * @return El precio del carrito con la Manzana
     */
    public double getPrecio() {
        if (VistaMexa.OfertaAlimentos() == true) {
            precio = producto.getPrecio() + (36.90 / 4) * 3;

        } else {
            precio = producto.getPrecio() + 36.90;
        }
        return precio;

    }

    /**
     * Obtiene el codigo de barras de la Manzana
     * 
     * @return El codigo de barras de la Manzana
     */
    @Override
    public String getCodigoBarras() {
        return "1849. ";
    }

    /**
     * Obtiene el nombre a mostrar en el catalogo de la Manzana
     * 
     * @return El nombre de la Manzana
     */
    @Override
    public String getNombre() {
        return "1 kg de Manzana Roja.                                        ($36.90)";
    }

}
