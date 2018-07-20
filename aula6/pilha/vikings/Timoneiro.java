package vikings;

import estrutura.*;

public class Timoneiro extends Viking {

    private String posicao;

    public Timoneiro() {
      this.posicao = "Timoneiro";
    }

    @Override
    public void gritar() {
      System.out.println(posicao + " ARRGH");
    }
}
