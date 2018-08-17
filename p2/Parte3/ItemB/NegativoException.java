public class NegativoException extends Exception {
  private int numero;
  
  public NegativoException(int numero) {
    this.numero = numero;
  }
  
  public int getNumero() {
    return this.numero;
  }
  
}
