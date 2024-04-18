import java.util.Iterator;
import java.io.Serializable;

/*
 * Esta clase es el proxy de nuestro catalogo para que el cliente no acceda directamente
 * al catalogo, más bien es un representante del catalogo real.
 */
public class CatalogoProxy implements Serializable, CatalogoRemoto {
    /**
     * Una instancia de Compra, que es la clase donde se encuentra nuestro
     * catalogo real.
     */
    private Compra catalogoReal = new Compra(null, null);

    /**
     * El constructor de la clase, actualiza el catalogoReal.
     * @param catalogoReal
     */
    public CatalogoProxy(Compra catalogoReal) {
        this.catalogoReal = catalogoReal;
    }

    /**
     * Metodo de la clase compra, lo sobreescribimos ya que recordemos
     * que este es un representante, lo único que hace es llamar al metodo
     * real.
     * Invoca al metodo {@link Compra#catalogoCompra()}
     */
    @Override
    public void catalogoCompra() {
        catalogoReal.catalogoCompra();
    }

    /**
     * Metodo de la clase compra, lo sobreescribimos ya que recordemos
     * que este es un representante, lo único que hace es llamar al metodo
     * real.
     * Invoca al metodo {@link Compra#printCatalogo()}
     */
    @Override
    public void printCatalogo(Iterator<Productos> iterador) {
        catalogoReal.printCatalogo(iterador);
    }

    /**
     * Metodo de la clase compra, lo sobreescribimos ya que recordemos
     * que este es un representante, lo único que hace es llamar al metodo
     * real.
     * Invoca al metodo {@link Compra#mostrarCatalogo()}
     * @return bool, un booleano que nos ayuda en el main, para poder salir del bucle 
     * que generamos a la hora de elegir la opcion "mostrar catalogo".
     */
    @Override
    public Boolean mostrarCatalogo(String opcionUsuario, ZMAINCHEEMS main) {
        Boolean bool = catalogoReal.mostrarCatalogo(opcionUsuario, main);
        return bool;
    }

}
