/**
 * Clase que representa el ingrediente Lechuga para "decorar" (agregarle a) una
 * Productos
 * Extiende de ObjetosCarrito
 */
public class CompraManzana extends CarritoObjetos {
    /**
     * Constructor de la clase Lechuga
     * 
     * @param producto La Productos a decorar con lechuga
     */
    public CompraManzana(Productos producto) {
        super(producto);
    }

    /**
     * Obtiene la descripción de la Productos con Lechuga
     * 
     * @return La descripción de la Productos con lechuga
     */
    public String getDescripcion() {
        return producto.getDescripcion() + "Manzana,";
    }

    /**
     * Obtiene el precio de la Productos con Lechuga
     * 
     * @return El precio de la Productos con lechuga
     */
    public double getPrecio() {
        return producto.getPrecio() + 36.9;

    }

    @Override
    public String getCodigoBarras() {
        return "1849. ";
    }

    @Override
    public String getNombre() {
        return "1 kg de Manzana.                                             ($36.9)";
    }

}
