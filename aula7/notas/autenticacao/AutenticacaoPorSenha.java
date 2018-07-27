package autenticacao;

import java.util.Scanner;

public class AutenticacaoPorSenha implements IMetodoAutenticacao {
  private Scanner cin = new Scanner(System.in);

  @Override
  public UsuarioAutenticado autenticar() throws UsuarioNaoAutenticadoException {
    System.out.println("Digite o codigo:");
    int cod = cin.nextInt();
    cin.nextLine();
    System.out.println("Digite o nome:");
    String nome = cin.next();

    UsuarioAutenticado usuario = new UsuarioAutenticado(cod, nome);

    System.out.println("Digite a SENHA:");
    int senha = cin.nextInt();

    if (senha == 1234) {
      return usuario;
    }
    throw new UsuarioNaoAutenticadoException();
  }
}
