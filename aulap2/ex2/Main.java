import pctbanco.*;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    int op;
    Scanner cin = new Scanner(System.in);
    Banco itau = new Banco();
    System.out.print("op: ");
    op = cin.nextInt();
    while (op != 0) {
      if (op == 1) {
        int dep = cin.nextInt();
        itau.abrirConta(dep);
      }
      else if (op == 2) {
        int id = cin.nextInt(), val = cin.nextInt();
        itau.transacao(id, val);
      }
      else if (op == 3) {
        int id = cin.nextInt();
        itau.saldo(id);
      }
      System.out.print("op: ");
      op = cin.nextInt();
    }
  }
}
