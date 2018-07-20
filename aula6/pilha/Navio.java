import estrutura.*;
import vikings.*;

public class Navio {
  public static void main(String[] args) {
    PilhaAprimorada navio = new PilhaAprimorada(20);

    try {
      navio.empilha(new Timoneiro());
      for (int i = 0;i < 18;i++) {
        navio.empilha(new Remador());
      }
      navio.empilha(new Lider());

      for (int i = 0;i < 20;i++) {
        ((Viking) navio.desempilha()).gritar();
      }
    }
    finally {
      System.out.println("ARRRRGH");
    }
  }
}
