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
        return producto.getPrecio() + 5.5;

    }

    @Override
    public String getCodigoBarras() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getID'");
    }

    @Override
    public String getNombre() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getNombre'");
    }

}
