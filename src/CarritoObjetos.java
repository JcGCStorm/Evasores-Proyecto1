/**
 * Clase abstracta que sirve como base para decoradores de ingredientes de
 * Productoss
 * Implementa la interfaz Productos
 */
public abstract class CarritoObjetos implements Productos {
    protected Productos producto;

    /**
     * Constructor de la clase ObjetosCarrito
     * 
     * @param producto La Productos a decorar con ingredientes
     */
    public CarritoObjetos(Productos producto) {
        this.producto = producto;

    }

    /**
     * Obtiene la descripción de la Productos decorada con ingredientes
     * 
     * @return La descripción de la Productos decorada con ingredientes
     */
    public String getDescripcion() {
        return producto.getDescripcion();
    }

    /**
     * Obtiene el precio de la Productos decorada con ingredientes
     * 
     * @return El precio de la Productos decorada con ingredientes
     */
    public double getPrecio() {
        return producto.getPrecio();
    }

}