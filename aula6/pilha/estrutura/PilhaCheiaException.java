package estrutura;

public class PilhaCheiaException extends PilhaException {
  private Object item;
  private int limite;

  public PilhaCheiaException(Object item, int limite) {
    this.item = item;
    this.limite = limite;
  }

  public int getLimite() {
    return this.limite;
  }

  public Object getItem() {
    return this.item;
  }
}
