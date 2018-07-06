public class MeuGuardaEncomenda implements GuardaEncomenda {
  private Encomenda[] vetorEncomendas = new Encomenda[1000];
  private int tamanho = 0;

  @Override
  public void adiciona(Encomenda e) {
    int i = 1;
    if (tamanho == 1000) {
      System.out.println("Estoque cheio");
    }
    else {
      for (Encomenda encomenda : vetorEncomendas) {
          if (encomenda == null) {
            break;
          }
          i *= e.compareTo(encomenda);
      }
      if (i != 0) {
        this.vetorEncomendas[tamanho] = e;
        tamanho++;
      }
    }
  }
  @Override
  public int getSize() {
    return tamanho;
  }
  @Override
  public void ordena() {
    for (int i = 0;i < tamanho - 1 && vetorEncomendas[i] != null;i++) {
      for (int j = i + 1;j < tamanho && vetorEncomendas[j] != null;j++) {
        if (vetorEncomendas[i].compareTo(vetorEncomendas[j]) == 1) {
          Encomenda troca = vetorEncomendas[i];
          vetorEncomendas[i] = vetorEncomendas[j];
          vetorEncomendas[j] = troca;
        }
      }
    }
  }
  @Override
  public String toString() {
    String ret = "";
    for(int i = 0;i < tamanho;++i) {
      ret = ret + vetorEncomendas[i] + ", ";
    }
    return ret;
  }
}
