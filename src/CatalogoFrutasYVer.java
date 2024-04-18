import java.util.ArrayList;

/*
 * La clase CatalogoFrutasYVer se encarga de agregar los productos de la categoria
 *  frutas y verduras a un arreglo, para facilitar su acceso y sobre todo facilitar 
 * la creación del catalogo final, el cuál contiene a todos los productos de CheemSmart. 
 */
public class CatalogoFrutasYVer {
    /**
     * @ArrayList Donde se guardan los productos del catalogo.
     */
    ArrayList<Productos> frutasYVerduras;

    /**
     * Constructor del catalogo de electrodomesticos, en este constructor se agregan
     * los productos del catalogo.
     * Invoca al metodo {@link CatalogoFrutasYVer#addItems}
     */
    public CatalogoFrutasYVer() {
        frutasYVerduras = new ArrayList<Productos>();

        addItems(new CompraLechuga(null));
        addItems(new CompraJitomate(null));
        addItems(new CompraManzana(null));
    }

    /**
     * Metodo que agrega productos al catalogo, recibe un Producto
     * 
     * @param productos
     */
    public void addItems(Productos productos) {
        frutasYVerduras.add(productos);
    }

    /**
    * Devuelve un ArrayList que contiene las frutas y verduras.
    *
    * @return electrodomesticos, un ArrayList que contiene las frutas y verduras.
    */
    public ArrayList<Productos> getArreglo() {
        return frutasYVerduras;
    }
}
