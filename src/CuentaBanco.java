// IDEA DE CUENTA CON PROXY , ¿EL PROXY ERA EN EL CATALOGO?
public class CuentaBanco implements CuentaInterface {
    private int saldo;
    private CuentaProxy proxy;

    public CuentaBanco(int saldoInicial) {
        this.saldo = saldoInicial;
    }

    @Override
    public void ingresarDinero(int cantidad) {
        this.saldo += cantidad;
    }

    @Override
    public void retirarDinero(int cantidad) throws SaldoInsuficienteException {
        if (cantidad > this.saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente");
        }
        this.saldo -= cantidad;
    }

    @Override
    public int revisarDinero() {
        return saldo;
    }

    public CuentaProxy getProxy() {
        if (this.proxy == null) {
            this.proxy = CuentaProxy.crearProxy(this);
        }
        return this.proxy;
    }

    public void resetProxy() {
        if (this.proxy != null) {
            this.proxy.actualizarOriginal();
            this.proxy = null;
        }
    }
}