package recurso;

import estrutura.FilaAprimorada;

public class FilaRecurso extends FilaAprimorada implements AutoCloseable {

  public FilaRecurso(int tamanho) {
    super(tamanho);
  }
  @Override
  public void close() {
    try {
      super.desenfileira();
    }
    finally {
      return;
    }
  }
}
