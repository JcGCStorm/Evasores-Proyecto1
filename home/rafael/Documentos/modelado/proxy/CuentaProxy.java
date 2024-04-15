public class CuentaProxy implements CuentaInterface {
    private final CuentaInterface original;
    private int balance;

    public CuentaProxy(CuentaInterface original) {
        this.original = original;
        this.balance = original.revisarDinero();
    }

    public static CuentaProxy crearProxy(CuentaInterface original) {
        return new CuentaProxy(original);
    }

    @Override
    public void ingresarDinero(int cantidad) {
        this.balance += cantidad;
    }

    @Override
    public void retirarDinero(int cantidad) throws SaldoInsuficienteException {
        if (cantidad > this.balance) {
            throw new SaldoInsuficienteException("Saldo insuficiente");
        }
        this.balance -= cantidad;
    }

    @Override
    public int revisarDinero() {
        return balance;
    }

    public void actualizarOriginal() {
        int diff = balance - original.revisarDinero();
        if (diff > 0) {
            original.ingresarDinero(diff);
        } else if (diff < 0) {
            try {
                original.retirarDinero(-diff);
            } catch (SaldoInsuficienteException e) {

                e.printStackTrace();
            }
        }
    }
}
