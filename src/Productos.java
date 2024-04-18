/**
 * Interfaz que representa un Producto
 */
public interface Productos {

    /**
     * Obtiene el nombre del producto
     * 
     * @return El nombre del producto
     */
    public String getNombre();

    /**
     * Obtiene la descripción del Producto
     * 
     * @return La descripción del producto
     */
    public String getDescripcion();

    /**
     * Obtiene el precio del producto
     * 
     * @return El precio del producto
     */
    public double getPrecio();
    
    /**
     * Obtiene el codigo de barras del producto
     * 
     * @return El codigo de barras del producto
     */
    public String getCodigoBarras();
}