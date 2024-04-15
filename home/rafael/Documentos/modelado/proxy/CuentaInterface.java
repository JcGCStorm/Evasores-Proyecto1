public interface CuentaInterface {
  void ingresarDinero(int cantidad);

  void retirarDinero(int cantidad) throws SaldoInsuficienteException;

  int revisarDinero();
}