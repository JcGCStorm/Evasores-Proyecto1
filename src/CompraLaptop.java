/**
 * Clase que representa el ingrediente Lechuga para "decorar" (agregarle a) una
 * Productos
 * Extiende de ObjetosCarrito
 */
public class CompraLaptop extends CarritoObjetos {
    /**
     * Constructor de la clase Lechuga
     * 
     * @param producto La Productos a decorar con lechuga
     */
    public CompraLaptop(Productos producto) {
        super(producto);
    }

    /**
     * Obtiene la descripción de la Productos con Lechuga
     * 
     * @return La descripción de la Productos con lechuga
     */
    public String getDescripcion() {
        return producto.getDescripcion() + "Laptop HP Procesador AMD Ryzen 3 8GB RAM 512GB SSD 15.6 Pulgadas,";
    }

    /**
     * Obtiene el precio de la Productos con Lechuga
     * 
     * @return El precio de la Productos con lechuga
     */
    public double getPrecio() {
        if (VistaGringo.OfertaElectronicos() == true) {
            precio = producto.getPrecio() + (10299.00 / 5) * 4;

        } else {
            precio = producto.getPrecio() + 10299.00;
        }
        return precio;

    }

    @Override
    public String getCodigoBarras() {
        return "2982. ";
    }

    @Override
    public String getNombre() {
        return "Laptop HP, con procesador Ryzen 3, 8GB de RAM.               ($10,299.00)";
    }

}
