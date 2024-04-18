/**
 * Clase Carrito que representa al carrito que envolvemos de Productos
 * cuenta con una descripcion y un precio como todos los productos ya que 
 * implementa a la interfaz Productos. Es nuestro chiclo centro.
 * 
 * @Implements Productos
 */
public class Carrito implements Productos {

    /**
     * Metodo getDescripcion, que nos devuelve la descripción del
     * carrito. Regresa una String solo con una flecha. Sobreescribe al
     * metodo getDescripcion de la interfaz Productos.
     * 
     * @return String que representa al carrito.
     */
    @Override
    public String getDescripcion() {
        return "----> ";
    }

    /**
     * Metodo getPrecio que sobreescribe al metodo homonimo de Productos
     * 
     * @returns un double que nos dice el precio del producto, al ser el
     * chiclo centro lo dejamos vacio.
     */
    @Override
    public double getPrecio() {
        return 0.0;
    }

    /**
     * Metodo getPrecio que sobreescribe al metodo homonimo de Productos
     * 
     * @returns un @String que nos dice el codigo de barras, como es el carrito lo
     * dejamos vacio.
     */
    @Override
    public String getCodigoBarras() {
        return "";
    }

     /**
     * Metodo getPrecio que sobreescribe al metodo homonimo de Productos
     * 
     * @returns un @String que nos dice el nombre del producto.
     */
    @Override
    public String getNombre() {
        return "Carrito";
    }
}