/**
 * Clase abstracta que sirve como base para decoradores de ingredientes de
 * Productos
 * Implementa la interfaz Productos
 */
public abstract class CarritoObjetos implements Productos {
    protected Productos producto;
    protected double precio;

    /**
     * Constructor de la clase CarritoObjetos
     * 
     * @param producto Los productos a decorar.
     */
    public CarritoObjetos(Productos producto) {
        this.producto = producto;

    }

    /**
     * Obtiene la descripción del Carrito decorada con productos.
     * 
     * @return La descripción del Carrito decorada con productos.
     */
    public String getDescripcion() {
        return producto.getDescripcion();
    }

    /**
     * Obtiene el precio del Carritp decorado con productos.
     * 
     * @return El precio del carrito decorado con productos.
     */
    public double getPrecio() {
        return precio;
    }

}