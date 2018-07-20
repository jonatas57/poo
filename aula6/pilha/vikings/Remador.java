package vikings;

import estrutura.*;

public class Remador extends Viking {
  private String posicao;

  public Remador() {
    this.posicao = "Remador";
  }

  @Override
  public void gritar() {
    System.out.println(posicao + " ARRGH");
  }
}
