import java.util.ArrayList;

/*
 * La clase CatalogoElectronica se encarga de agregar productos electronicos
 * a un arreglo, para facilitar su acceso y sobre todo facilitar la creación del 
 * catalogo final, el cuál contiene a todos los productos de CheemSmart. 
 */
public class CatalogoElectronica {
    /**
     * @ArrayList Donde se guardan los productos del catalogo de electronica.
     */
    ArrayList<Productos> electronica;

    /**
     * Constructor del catalogo de electronica, en este constructor se agregan los
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
     * Metodo que agrega productos al catalogo, recibe Productos
     * 
     * @param productos
     */
    public void addItems(Productos productos) {
        electronica.add(productos);
    }

    /**
    * Devuelve un ArrayList que contiene los productos electronicos.
    *
    * @return electronica, un ArrayList que contiene los productos electronicos.
    */
    public ArrayList<Productos> getArreglo() {
        return electronica;
    }

}
