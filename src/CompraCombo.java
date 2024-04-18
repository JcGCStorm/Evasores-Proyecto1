/**
 * Clase que representa el producto "Combo" para "decorar" (agregarle a) el carrito.
 * Extiende de ObjetosCarrito
 */
public class CompraCombo extends CarritoObjetos {
    /**
     * Constructor de la clase CompraCombo
     * 
     * @param producto El carrito a decorar con lechuga
     */
    public CompraCombo(Productos producto) {
        super(producto);
    }

    /**
     * Obtiene la descripción del carrito con el producot Combo
     * 
     * @return La descripción del carrito con lechuga
     */
    public String getDescripcion() {
        return producto.getDescripcion() + "Combo Oster 4 Elementos, Licuadora, Cafetera, Batidora y Plancha Rojo, ";
    }

    /**
     * Obtiene el precio del carrito con el combo
     * 
     * @return El precio del carrito con el combo
     */
    public double getPrecio() {
        if (VistaEspanol.OfertaElectrodomesticos() == true) {
            precio = producto.getPrecio() + (2369.90 / 5) * 4;

        } else {
            precio = producto.getPrecio() + 2369.90;
        }
        return precio;

    }

    /**
     * Obtiene el codigo de barras del combo
     * 
     * @return El codigo de barras del combo
     */
    @Override
    public String getCodigoBarras() {
        return "3212. ";
    }

    /**
     * Obtiene el nombre a mostrar en el catalogo del combo
     * 
     * @return El nombre del combo
     */
    @Override
    public String getNombre() {
        return "Combo 4 Elementos, Licuadora, Cafetera, Batidora y Plancha.  ($2,369.90)";
    }

    @Override
    public String getDepartamento() {
        return "Electrodomesticos";
    }

}
