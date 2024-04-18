/**
 * Clase que representa el ingrediente Lechuga para "decorar" (agregarle a) una
 * Productos
 * Extiende de ObjetosCarrito
 */
public class CompraLechuga extends CarritoObjetos {
    /**
     * Constructor de la clase Lechuga
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

    @Override
    public String getCodigoBarras() {
        return "1938. ";
    }

    @Override
    public String getNombre() {
        return "Lechuga.                                                     ($5.50)";
    }

}
