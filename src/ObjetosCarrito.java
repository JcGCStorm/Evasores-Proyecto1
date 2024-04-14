/**
 * Clase abstracta que sirve como base para decoradores de ingredientes de
 * Productoss
 * Implementa la interfaz Productos
 */
public abstract class ObjetosCarrito implements Productos {
    protected Productos pan;

    /**
     * Constructor de la clase ObjetosCarrito
     * 
     * @param pan La Productos a decorar con ingredientes
     */
    public ObjetosCarrito(Productos pan) {
        this.pan = pan;

    }

    /**
     * Obtiene la descripción de la Productos decorada con ingredientes
     * 
     * @return La descripción de la Productos decorada con ingredientes
     */
    public String getDescripcion() {
        return pan.getDescripcion();
    }

    /**
     * Obtiene el precio de la Productos decorada con ingredientes
     * 
     * @return El precio de la Productos decorada con ingredientes
     */
    public double getPrecio() {
        return pan.getPrecio();
    }

}