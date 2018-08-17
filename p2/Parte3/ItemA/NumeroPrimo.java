public class NumeroPrimo {
  private int valor;
  
  public NumeroPrimo(int valor) throws Exception {
    if (verificaPrimo(valor)) {
      this.valor = valor;
    }
    else {
      throw new Exception("Primo Invalido");
    }
  }
  
  public int getValor() {
    return this.valor;
  }
  
  private boolean verificaPrimo(int valor) {
    boolean primo = true;
    double raiz = Math.sqrt(valor);
    for (int i = 2;i <= raiz;i++) {
      primo = primo && (valor % i != 0);
    }
    return primo;
  }
}
