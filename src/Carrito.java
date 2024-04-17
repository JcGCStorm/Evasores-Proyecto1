/**
 * Clase PanAjoRostizado que representa un tipo de pan de la Productos
 * Cuenta con una descripcion y un precio ya asignados. Implementa a la
 * interfaz Productos.
 * 
 * @Implements Productos
 */
public class Carrito implements Productos {

    /**
     * Metodo getDescripcion, que nos devuelve la descripción del
     * pan. Regresa una String con el tipo de pan que es. Sobreescribe al
     * metodo getDescripcion de la interfaz Productos.
     * 
     * @return String que representa al pan.
     */
    @Override
    public String getDescripcion() {
        return "----> ";
    }

    /**
     * Metodo getPrecio que sobreescribe al metodo homonimo de Productos
     * 
     * @returns un double que nos dice el precio del pan
     */
    @Override
    public double getPrecio() {
        return 0.0;
    }

    @Override
    public String getCodigoBarras() {
        return "";
    }

    @Override
    public String getNombre() {
        return "Carrito";
    }
}