/**
 * Clase que representa el ingrediente Lechuga para "decorar" (agregarle a) una
 * Productos
 * Extiende de ObjetosCarrito
 */
public class CompraLechuga extends CarritoObjetos {
    /**
     * Constructor de la clase CompraLechuga
     * 
     * @param producto La Productos a decorar con lechuga
     */
    public CompraLechuga(Productos producto) {
        super(producto);
    }

    /**
     * Obtiene la descripción de la Productos con Lechuga
     * 
     * @return La descripción de la Productos con lechuga
     */
    public String getDescripcion() {
        return producto.getDescripcion() + "Lechuga, ";
    }

    /**
     * Obtiene el precio de la Productos con Lechuga
     * 
     * @return El precio de la Productos con lechuga
     */
    public double getPrecio() {
        if (VistaMexa.OfertaAlimentos() == true) {
            precio = producto.getPrecio() + (5.5 / 4) * 3;

        } else {
            precio = producto.getPrecio() + 5.5;
        }
        return precio;
    }

    /**
     * Obtiene el codigo de barras de la Lechuga
     * 
     * @return El codigo de barras de la Lechuga
     */
    @Override
    public String getCodigoBarras() {
        return "1938. ";
    }

    /**
     * Obtiene el nombre a mostrar en el catalogo de la Lechuga
     * 
     * @return El nombre de la Lechuga
     */
    @Override
    public String getNombre() {
        return "Una Lechuga.                                                 ($5.50)";
    }

    @Override
    public String getDepartamento() {
        return "Frutas y Verduras";
    }
}
