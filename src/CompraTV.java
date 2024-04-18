/**
 * Clase que representa el ingrediente Lechuga para "decorar" (agregarle a) una
 * Productos
 * Extiende de ObjetosCarrito
 */
public class CompraTV extends CarritoObjetos {
    /**
     * Constructor de la clase Lechuga
     * 
     * @param producto La Productos a decorar con lechuga
     */
    public CompraTV(Productos producto) {
        super(producto);
    }

    /**
     * Obtiene la descripción de la Productos con Lechuga
     * 
     * @return La descripción de la Productos con lechuga
     */
    public String getDescripcion() {
        return producto.getDescripcion() + "TV Hisense 43 Pulgadas Full HD Smart TV LED, ";
    }

    /**
     * Obtiene el precio de la Productos con Lechuga
     * 
     * @return El precio de la Productos con lechuga
     */
    public double getPrecio() {
        if (VistaGringo.OfertaElectronicos() == true) {
            precio = producto.getPrecio() + (5199.00 / 5) * 4;

        } else {
            precio = producto.getPrecio() + 5199.00;
        }
        return precio;

    }

    @Override
    public String getCodigoBarras() {
        return "2093. ";
    }

    @Override
    public String getNombre() {
        return "Television Hisense 43 Pulgadas.                               ($5,199.00)";
    }

}