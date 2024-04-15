// IDEA DE CUENTA CON PROXY, ¿EL PROXY ERA EN EL CATALOGO?
public interface CuentaInterface {
    void ingresarDinero(int cantidad);

    void retirarDinero(int cantidad) throws SaldoInsuficienteException;

    int revisarDinero();
}