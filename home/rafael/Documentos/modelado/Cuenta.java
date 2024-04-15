public class Cuenta implements CuentaBanco {

    CuentaProxy proxy;

    int dinero;

    public Cuenta(int dinero) {
        this.dinero = dinero;
    }

    @Override
    public void ingresarDinero(int cantidad) {
        this.dinero = this.dinero + cantidad;
    }

    @Override
    public void retirarDinero(int cantidad) {
        this.dinero = this.dinero - cantidad;
    }

    @Override
    public int revisarDinero() {
        return dinero;
    }

    public CuentaProxy getProxy() {
        if (this.proxy == null) {
            this.proxy = CuentaProxy.crearProxy(this);
            return this.proxy;
        } else {
            return this.proxy;
        }
    }

    public void resetProxy() {
        this.proxy.actualizarOriginal();
        this.proxy = null;
    }

}