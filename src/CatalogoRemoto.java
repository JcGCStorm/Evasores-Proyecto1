import java.util.Iterator;

/**
 * Esta interfaz nos ayuda a crear el proxy, debe ser implementada tanto por el proxy como
 * por la clase que tiene los metodos reales.
 */
public interface CatalogoRemoto {

    /**
     * catalogoCompra() es el metodo real de Compra que queremos hacer remoto.
     */
    public void catalogoCompra();

    /**
     * printCatalogo() es el metodo real de Compra que queremos hacer remoto.
     */
    public void printCatalogo(Iterator<Productos> iterador);

    /**
     * mostrarCatalogo() es el metodo real de Compra queremos hacer remoto.
     */
    public Boolean mostrarCatalogo(String opcionUsuario, ZMAINCHEEMS main);

}
