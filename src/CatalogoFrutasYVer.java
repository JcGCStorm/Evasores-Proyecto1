import java.util.ArrayList;

public class CatalogoFrutasYVer {
    /**
     * @ArrayList Donde se guardan las productoss del catalogo.
     */
    ArrayList<Productos> frutasYVerduras;

    /**
     * Constructor del menú dinamico, en este constructor se agregan las
     * productoss del catalogo.
     * Invoca al metodo {@link CatalogoFrutasYVer#addItems}
     */
    public CatalogoFrutasYVer() {
        frutasYVerduras = new ArrayList<Productos>();

        addItems(new CompraLechuga(null));
        addItems(new CompraJitomate(null));
        addItems(new CompraManzana(null));
    }

    /**
     * Metodo que agrega productoss al catalogo, recibe una Producto
     * 
     * @param productos
     */
    public void addItems(Productos productos) {
        frutasYVerduras.add(productos);
    }

    public ArrayList<Productos> getArreglo() {
        return frutasYVerduras;
    }
}
