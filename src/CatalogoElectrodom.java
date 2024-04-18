import java.util.ArrayList;

public class CatalogoElectrodom {
    /**
     * @ArrayList Donde se guardan los productos del catalogo.
     */
    ArrayList<Productos> electrodomesticos;

    /**
     * Constructor del catalogo de electrodomesticos, en este constructor se agregan
     * los
     * productos del catalogo.
     * Invoca al metodo {@link CatalogoElectrodom#addItems}
     */
    public CatalogoElectrodom() {
        electrodomesticos = new ArrayList<Productos>();

        addItems(new CompraLavadora(null));
        addItems(new CompraVentilador(null));
        addItems(new CompraCombo(null));
    }

    /**
     * Metodo que agrega productos al menu, recibe un Producto
     * 
     * @param productos
     */
    public void addItems(Productos productos) {
        electrodomesticos.add(productos);
    }

    public ArrayList<Productos> getArreglo() {
        return electrodomesticos;
    }

}
