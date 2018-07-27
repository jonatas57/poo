package autenticacao;

import java.util.Scanner;

public class AutenticacaoPorSwipe implements IMetodoAutenticacao {
  private Scanner cin = new Scanner(System.in);

  @Override
  public UsuarioAutenticado autenticar() throws UsuarioNaoAutenticadoException {
    System.out.println("Digite o codigo:");
    int cod = cin.nextInt();
    cin.nextLine();
    System.out.println("Digite o nome:");
    String nome = cin.nextLine();

    UsuarioAutenticado usuario = new UsuarioAutenticado(cod, nome);

    System.out.println("   1   2   3\n\n1  o   o   o\n\n2  o   o   o\n\n3  o   o   o");
    System.out.println("Digite a sequencia de swipe (xy):");
    int swipe = cin.nextInt();

    if (swipe == 112233) {
      return usuario;
    }
    throw new UsuarioNaoAutenticadoException();
  }
}
