/**
 * Clase que representa el producto "TV" para "decorar" (agregarle a) el carrito.
 * Extiende de ObjetosCarrito
 */
public class CompraTV extends CarritoObjetos {
     /**
     * Constructor de la clase CompraTV
     * 
     * @param producto El carrito a decorar con una television.
     */
    public CompraTV(Productos producto) {
        super(producto);
    }

    /**
     * Obtiene la descripción del carrito con la television
     * 
     * @return La descripción del carrito con TV
     */
    public String getDescripcion() {
        return producto.getDescripcion() + "TV Hisense 43 Pulgadas Full HD Smart TV LED, ";
    }

    /**
     * Obtiene el precio del carrito con la TV
     * 
     * @return El precio del carrito con la television
     */
    public double getPrecio() {
        if (VistaGringo.OfertaElectronicos() == true) {
            precio = producto.getPrecio() + (5199.00 / 5) * 4;

        } else {
            precio = producto.getPrecio() + 5199.00;
        }
        return precio;

    }

    /**
     * Obtiene el codigo de barras de la Tv
     * 
     * @return El codigo de barras de la television
     */
    @Override
    public String getCodigoBarras() {
        return "2093. ";
    }

    /**
     * Obtiene el nombre a mostrar en el catalogo de la TV
     * 
     * @return El nombre de la Television
     */
    @Override
    public String getNombre() {
        return "Television Hisense 43 Pulgadas.                              ($5,199.00)";
    }

    @Override
    public String getDepartamento() {
        return "Electronicos";
    }
}