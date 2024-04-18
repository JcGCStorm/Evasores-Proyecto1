/**
 * Clase que representa el ingrediente Lechuga para "decorar" (agregarle a) una
 * Productos
 * Extiende de ObjetosCarrito
 */
public class CompraJitomate extends CarritoObjetos {
    /**
     * Constructor de la clase Lechuga
     * 
     * @param producto La Productos a decorar con lechuga
     */
    public CompraJitomate(Productos producto) {
        super(producto);
    }

    /**
     * Obtiene la descripción de la Productos con Lechuga
     * 
     * @return La descripción de la Productos con lechuga
     */
    public String getDescripcion() {
        return producto.getDescripcion() + "Jitomate,";
    }

    /**
     * Obtiene el precio de la Productos con Lechuga
     * 
     * @return El precio de la Productos con lechuga
     */
    public double getPrecio() {
        if (VistaMexa.OfertaAlimentos() == true) {
            precio = producto.getPrecio() + (39.90 / 4) * 3;

        } else {
            precio = producto.getPrecio() + 39.90;
        }
        return precio;
    }

    @Override
    public String getCodigoBarras() {
        return "1672. ";
    }

    @Override
    public String getNombre() {
        return "1 kg de Jitomate.                                            ($39.90)";
    }

}
