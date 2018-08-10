package estrutura;

public class PilhaERecurso extends PilhaE implements AutoCloseable {

  public PilhaERecurso(int tamanhoMax) {
    super(tamanhoMax);
  }

  @Override
  public void close() {
    int qtd = 0;
    while (true) {
      try {
        this.desempilha();
        qtd++;
      } catch (PilhaVaziaException e) {
        System.out.printf("Pilha foi esvaziada! Tinha %d itens\n", qtd);
        break;
      }
    }
  }
}
