public class NumeroAlien {
  private int numero;
  
  public NumeroAlien(int numero) throws NegativoException {
    if (numero >= 0) {
      this.numero = numero;
    }
    else {
      throw new NegativoException(numero);
    }
  }
}
