/**
 * Clase que representa el producto "Ventilador" para "decorar" (agregarle a) el carrito.
 * Extiende de ObjetosCarrito
 */
public class CompraVentilador extends CarritoObjetos {
    /**
     * Constructor de la clase CompraVentilador
     * 
     * @param producto El carrito a decorar con un ventilador.
     */
    public CompraVentilador(Productos producto) {
        super(producto);
    }

    /**
     * Obtiene la descripción del carrito con el ventilador
     * 
     * @return La descripción del carrito con un ventilador
     */
    public String getDescripcion() {
        return producto.getDescripcion() + "Ventilador de Piso Taurus 20 Pulgadas, ";
    }

    /**
     * Obtiene el precio del carrito con un ventilador
     * 
     * @return El precio del carrito con el ventilador
     */
    public double getPrecio() {
        if (VistaEspanol.OfertaElectrodomesticos() == true) {
            precio = producto.getPrecio() + (889.00 / 5) * 4;

        } else {
            precio = producto.getPrecio() + 889.00;
        }
        return precio;
    }

     /**
     * Obtiene el codigo de barras del Ventilador
     * 
     * @return El codigo de barras del ventilador
     */
    @Override
    public String getCodigoBarras() {
        return "3257. ";
    }

    /**
     * Obtiene el nombre a mostrar en el catalogo del Ventilador
     * 
     * @return El nombre del ventilador
     */
    @Override
    public String getNombre() {
        return "Ventilador de Piso Taurus 20 Pulgadas.                       ($889.00)";
    }

    @Override
    public String getDepartamento() {
        return "Electrodomesticos";
    }

}
