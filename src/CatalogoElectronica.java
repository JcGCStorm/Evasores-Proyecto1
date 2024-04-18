import java.util.ArrayList;

public class CatalogoElectronica {
    /**
     * @ArrayList Donde se guardan los productos del catalogo de electronica.
     */
    ArrayList<Productos> electronica;

    /**
     * Constructor del catalogo de electronica, en este constructor se agregan las
     * productos del catalogo.
     * Invoca al metodo {@link CatalogoElectronica#addItems}
     */
    public CatalogoElectronica() {
        electronica = new ArrayList<Productos>();

        addItems(new CompraTV(null));
        addItems(new CompraZwitch(null));
        addItems(new CompraLaptop(null));
    }

    /**
     * Metodo que agrega productos al catalogo, recibe una Productos
     * 
     * @param productos
     */
    public void addItems(Productos productos) {
        electronica.add(productos);
    }

    public ArrayList<Productos> getArreglo() {
        return electronica;
    }

}
