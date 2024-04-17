/**
 * Interfaz que representa una baguette
 */
public interface Productos {

    public String getNombre();

    /**
     * Obtiene la descripción de la baguette
     * 
     * @return La descripción de la baguette
     */
    public String getDescripcion();

    /**
     * Obtiene el precio de la baguette
     * 
     * @return El precio de la baguette
     */
    public double getPrecio();

    public String getCodigoBarras();
}