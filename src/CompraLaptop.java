/**
 * Clase que representa el producto "Laptop" para "decorar" (agregarle a) el carrito.
 * Extiende de ObjetosCarrito
 */
public class CompraLaptop extends CarritoObjetos {
    /**
     * Constructor de la clase CompraLaptop
     * 
     * @param producto El carrito a decorar con una Laptop
     */
    public CompraLaptop(Productos producto) {
        super(producto);
    }

    /**
     * Obtiene la descripción del carrito con la Laptop
     * 
     * @return La descripción del carrito con la Laptop
     */
    public String getDescripcion() {
        return producto.getDescripcion() + "Laptop HP Procesador AMD Ryzen 3 8GB RAM 512GB SSD 15.6 Pulgadas,";
    }

    /**
     * Obtiene el precio del carrito con la Laptop
     * 
     * @return El precio del carrito con la Laptop
     */
    public double getPrecio() {
        if (VistaGringo.OfertaElectronicos() == true) {
            precio = producto.getPrecio() + (10299.00 / 5) * 4;

        } else {
            precio = producto.getPrecio() + 10299.00;
        }
        return precio;

    }

    /**
     * Obtiene el codigo de barras de la Laptop
     * 
     * @return El codigo de barras de la Laptop
     */
    @Override
    public String getCodigoBarras() {
        return "2982. ";
    }

    /**
     * Obtiene el nombre a mostrar en el catalogo de la Laptop
     * 
     * @return El nombre de la Laptop
     */
    @Override
    public String getNombre() {
        return "Laptop HP, con procesador Ryzen 3, 8GB de RAM.               ($10,299.00)";
    }

    @Override
    public String getDepartamento() {
        return "Electronicos";
    }

}
