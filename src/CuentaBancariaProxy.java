public class CuentaBancariaProxy {
    private CuentaBancaria cuentaOriginal;
    private String clave;

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

    public void setClave(String clave) {
        this.clave = clave;
    }

    /**
     * Verifica si la clave proporcionada coincide con la clave de la cuenta
     * 
     * @return true si la clave coincide, false en caso contrario
     */
    public boolean verificarClave() {
        return clave.equals(cuentaOriginal.getClave());
    }
}