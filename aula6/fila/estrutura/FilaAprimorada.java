package estrutura;

public class FilaAprimorada extends FilaSimples {
  private boolean vazia;

  public FilaAprimorada(int tamanho) {
    super(tamanho);
    this.vazia = true;
  }

  @Override
  public void enfileira(Object novoItem) {
    if (super.getInicio() == super.getFim() && !this.vazia) {
      throw new FilaCheiaException(novoItem, super.getTamanhoMax());
    }
		super.enfileira(novoItem);
    this.vazia = false;
	}

  @Override
	public Object desenfileira() {
    if (this.vazia) throw new FilaVaziaException();
		Object item = super.desenfileira();
    if (super.getInicio() == super.getFim()) {
      this.vazia = true;
    }
    return item;
	}
}
