/**
 * Clase que representa el ingrediente Lechuga para "decorar" (agregarle a) una
 * Productos
 * Extiende de ObjetosCarrito
 */
public class CompraCombo extends CarritoObjetos {
    /**
     * Constructor de la clase Lechuga
     * 
     * @param producto La Productos a decorar con lechuga
     */
    public CompraCombo(Productos producto) {
        super(producto);
    }

    /**
     * Obtiene la descripción de la Productos con Lechuga
     * 
     * @return La descripción de la Productos con lechuga
     */
    public String getDescripcion() {
        return producto.getDescripcion() + "Combo Oster 4 Elementos, Licuadora, Cafetera, Batidora y Plancha Rojo, ";
    }

    /**
     * Obtiene el precio de la Productos con Lechuga
     * 
     * @return El precio de la Productos con lechuga
     */
    public double getPrecio() {
        if (VistaEspanol.OfertaElectrodomesticos() == true) {
            precio = producto.getPrecio() + (2369.90 / 5) * 4;

        } else {
            precio = producto.getPrecio() + 2369.90;
        }
        return precio;

    }

    @Override
    public String getCodigoBarras() {
        return "3212. ";
    }

    @Override
    public String getNombre() {
        return "Combo 4 Elementos, Licuadora, Cafetera, Batidora y Plancha.  ($2,369.90)";
    }

}
