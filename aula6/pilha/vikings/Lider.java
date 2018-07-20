package vikings;

import estrutura.*;

public class Lider extends Viking {
  private String posicao;

  public Lider() {
    this.posicao = "Lider";
  }

  @Override
  public void gritar() {
    System.out.println(posicao + " ARRGH");
  }
}
