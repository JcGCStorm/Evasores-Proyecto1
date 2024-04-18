public class CuentaBancariaProxy {
    private CuentaBancaria cuentaOriginal;

    public CuentaBancariaProxy(CuentaBancaria cuentaOriginal) {
        this.cuentaOriginal = cuentaOriginal;
    }

    /**
     * Obtiene el saldo actual de la cuenta bancaria
     * 
     * @return El saldo actual de la cuenta bancaria
     */
    public double getSaldo() {
        return cuentaOriginal.getSaldo();
    }

    /**
     * Realiza un pago desde la cuenta bancaria, disminuyendo el saldo
     * 
     * @param monto El monto del pago a realizar
     */
    public void realizarPago(double monto) {
        cuentaOriginal.realizarPago(monto);
    }

    /**
     * Actualiza el monto en la cuenta bancaria original
     * 
     * @param nuevoSaldo El nuevo saldo de la cuenta bancaria
     */
    public void actualizarSaldo(double nuevoSaldo) {
        cuentaOriginal.setSaldo(nuevoSaldo);
    }
}