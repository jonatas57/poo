package estrutura;

public class PilhaAprimorada extends PilhaSimples {
  public PilhaAprimorada(int tamanho) {
    super(tamanho);
  }

  @Override
  public void empilha(Object novoItem) {
    if (super.getTopo() == super.getTamanhoMax() - 1) {
      throw new PilhaCheiaException(novoItem, super.getTamanhoMax());
    }
		super.empilha(novoItem);
	}

  @Override
	public Object desempilha() {
    if (super.getTopo() == -1) throw new PilhaVaziaException();
		return super.desempilha();
	}
}
