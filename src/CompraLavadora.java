/**
 * Clase que representa el producto "Lavadora" para "decorar" (agregarle a) el carrito.
 * Extiende de ObjetosCarrito
 */
public class CompraLavadora extends CarritoObjetos {
    /**
     * Constructor de la clase CompraLavadora
     * 
     * @param producto El carrito a decorar con jitomate
     */
    public CompraLavadora(Productos producto) {
        super(producto);
    }

     /**
     * Obtiene la descripción del carrito con la Lavadora
     * 
     * @return La descripción del carrito con la Lavadora
     */
    public String getDescripcion() {
        return producto.getDescripcion() + "Lavadora Midea Doble Tina 11 Kg Blanca, ";
    }

    /**
     * Obtiene el precio del carrito con la Lavadora
     * 
     * @return El precio del carrito con la Lavadora
     */
    public double getPrecio() {
        if (VistaEspanol.OfertaElectrodomesticos() == true) {
            precio = producto.getPrecio() + (3690.00 / 5) * 4;

        } else {
            precio = producto.getPrecio() + 3690.00;
        }
        return precio;

    }

    /**
     * Obtiene el codigo de barras de la Lavadora
     * 
     * @return El codigo de barras de la lavadora.
     */
    @Override
    public String getCodigoBarras() {
        return "3956. ";
    }

    /**
     * Obtiene el nombre a mostrar en el catalogo de la Lavadora
     * 
     * @return El nombre de la Lavadora
     */
    @Override
    public String getNombre() {
        return "Lavadora Midea Doble Tina 11 Kg Blanca.                      ($3690.0)";
    }

}
