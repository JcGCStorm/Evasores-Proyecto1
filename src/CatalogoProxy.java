import java.util.Iterator;
import java.io.Serializable;

public class CatalogoProxy implements Serializable, CatalogoRemoto {
    private Compra catalogoReal = new Compra(null, null);

    public CatalogoProxy(Compra catalogoReal) {
        this.catalogoReal = catalogoReal;
    }

    @Override
    public void catalogoCompra() {
        catalogoReal.catalogoCompra();
    }

    @Override
    public void printCatalogo(Iterator<Productos> iterador) {
        catalogoReal.printCatalogo(iterador);
    }

    @Override
    public Boolean mostrarCatalogo(String opcionUsuario, ZMAINCHEEMS main) {
        Boolean bool = catalogoReal.mostrarCatalogo(opcionUsuario, main);
        return bool;
    }

}
