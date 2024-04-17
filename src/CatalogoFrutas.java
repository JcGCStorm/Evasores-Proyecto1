import java.util.ArrayList;
public class CatalogoFrutasYVerduras {
     /**
     * @ArrayList Donde se guardan las hamburguesas del menu dinamico.
     */
    ArrayList<Productos> FrutasYVerduras;

    /**
    * Constructor del menú dinamico, en este constructor se agregan las
    * hamburguesas del menu. 
    * Invoca al metodo {@link MenuDinamico#addItems}
    */
   public CatalogoElectronica(){
    electronica = new ArrayList<Productos>();

    addItems(new CompraTV(null));
    addItems(new CompraZwitch(null));
    addItems(new CompraLaptop(null));
   }

   /**
    * Metodo que agrega hamburguesas al menu, recibe una Hamburguesa
    * @param hamburguesa
    */
   public void addItems(Productos productos){
        electronica.add(productos);
   }

    public ArrayList<Productos> getArreglo(){
        return electronica;
    }
}
