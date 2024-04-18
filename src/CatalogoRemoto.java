import java.rmi.*;
import java.util.Iterator;

public interface CatalogoRemoto extends Remote {

    public void catalogoCompra() throws RemoteException;

    public void printCatalogo(Iterator<Productos> iterador) throws RemoteException;

    public Boolean mostrarCatalogo(String opcionUsuario, ZMAINCHEEMS main) throws RemoteException;

}
