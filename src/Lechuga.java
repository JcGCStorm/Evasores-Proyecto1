/**
 * Clase que representa el ingrediente Lechuga para "decorar" (agregarle a) una
 * Productos
 * Extiende de ObjetosCarrito
 */
public class Lechuga extends ObjetosCarrito {
    /**
     * Constructor de la clase Lechuga
     * 
     * @param pan La Productos a decorar con lechuga
     */
    public Lechuga(Productos pan) {
        super(pan);
    }

    /**
     * Obtiene la descripción de la Productos con Lechuga
     * 
     * @return La descripción de la Productos con lechuga
     */
    public String getDescripcion() {
        return pan.getDescripcion() + "Lechuga,";
    }

    /**
     * Obtiene el precio de la Productos con Lechuga
     * 
     * @return El precio de la Productos con lechuga
     */
    public double getPrecio() {
        return pan.getPrecio() + 5.5;

    }

}
