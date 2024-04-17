import java.util.ArrayList;
public class CatalogoFrutasYVer {
     /**
     * @ArrayList Donde se guardan las hamburguesas del menu dinamico.
     */
    ArrayList<Productos> frutasYVerduras;

    /**
    * Constructor del menú dinamico, en este constructor se agregan las
    * hamburguesas del menu. 
    * Invoca al metodo {@link MenuDinamico#addItems}
    */
   public CatalogoFrutasYVer(){
    frutasYVerduras = new ArrayList<Productos>();

    addItems(new CompraTV(null));
    addItems(new CompraZwitch(null));
    addItems(new CompraLaptop(null));
   }

   /**
    * Metodo que agrega hamburguesas al menu, recibe una Hamburguesa
    * @param hamburguesa
    */
   public void addItems(Productos productos){
        frutasYVerduras.add(productos);
   }

    public ArrayList<Productos> getArreglo(){
        return frutasYVerduras;
    }
}
