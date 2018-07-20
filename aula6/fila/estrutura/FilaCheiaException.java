package estrutura;

public class FilaCheiaException extends FilaException {
  private Object item;
  private int limite;

  public FilaCheiaException(Object item, int limite) {
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
