import java.util.ArrayList;
public class CatalogoElectrodom {
    /**
     * @ArrayList Donde se guardan las hamburguesas del menu dinamico.
     */
    ArrayList<Productos> electrodomesticos;

    /**
    * Constructor del menú dinamico, en este constructor se agregan las
    * hamburguesas del menu. 
    * Invoca al metodo {@link MenuDinamico#addItems}
    */
   public CatalogoElectrodom(){
    electrodomesticos = new ArrayList<Productos>();

    addItems(new CompraLavadora(null));
    addItems(new CompraVentilador(null));
    addItems(new CompraCombo(null));
   }

   /**
    * Metodo que agrega hamburguesas al menu, recibe una Hamburguesa
    * @param hamburguesa
    */
   public void addItems(Productos productos){
        electrodomesticos.add(productos);
   }

    public ArrayList<Productos> getArreglo(){
        return electrodomesticos;
    }


}
