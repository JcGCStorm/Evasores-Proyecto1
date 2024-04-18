/**
 * Clase que representa el ingrediente Lechuga para "decorar" (agregarle a) una
 * Productos
 * Extiende de ObjetosCarrito
 */
public class CompraLavadora extends CarritoObjetos {
    /**
     * Constructor de la clase Lechuga
     * 
     * @param producto La Productos a decorar con lechuga
     */
    public CompraLavadora(Productos producto) {
        super(producto);
    }

    /**
     * Obtiene la descripción de la Productos con Lechuga
     * 
     * @return La descripción de la Productos con lechuga
     */
    public String getDescripcion() {
        return producto.getDescripcion() + "Lavadora Midea Doble Tina 11 Kg Blanca, ";
    }

    /**
     * Obtiene el precio de la Productos con Lechuga
     * 
     * @return El precio de la Productos con lechuga
     */
    public double getPrecio() {
        return producto.getPrecio() + 3690.0;

    }

    @Override
    public String getCodigoBarras() {
        return "3956. ";
    }

    @Override
    public String getNombre() {
        return "Lavadora Midea Doble Tina 11 Kg Blanca.                      ($3690.0)";
    }



}
