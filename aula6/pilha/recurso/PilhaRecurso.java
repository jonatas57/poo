package recurso;

import estrutura.PilhaAprimorada;

public class PilhaRecurso extends PilhaAprimorada implements AutoCloseable {

  public PilhaRecurso(int tamanho) {
    super(tamanho);
  }
  @Override
  public void close() {
    try {
      super.desempilha();
    }
    finally {
      return;
    }
  }
}
