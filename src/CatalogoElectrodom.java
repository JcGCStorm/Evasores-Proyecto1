import java.util.ArrayList;

/*
 * La clase CatalogoElectrodom se encarga de agregar productos electrodomesticos
 * a un arreglo, para facilitar su acceso y sobre todo facilitar la creación del 
 * catalogo final, el cuál contiene a todos los productos de CheemSmart. 
 */
public class CatalogoElectrodom {
    /**
     * @ArrayList Donde se guardan los productos del catalogo.
     */
    ArrayList<Productos> electrodomesticos;

    /**
     * Constructor del catalogo de electrodomesticos, en este constructor se agregan
     * los productos del catalogo.
     * Invoca al metodo {@link CatalogoElectrodom#addItems}
     */
    public CatalogoElectrodom() {
        electrodomesticos = new ArrayList<Productos>();

        addItems(new CompraLavadora(null));
        addItems(new CompraVentilador(null));
        addItems(new CompraCombo(null));
    }

    /**
     * Metodo que agrega productos al catalogo, recibe un Producto
     * 
     * @param productos
     */
    public void addItems(Productos productos) {
        electrodomesticos.add(productos);
    }

    /**
    * Devuelve un ArrayList que contiene los electrodomésticos.
    *
    * @return electrodomesticos, un ArrayList que contiene los electrodomésticos.
    */
    public ArrayList<Productos> getArreglo() {
        return electrodomesticos;
    }

}
