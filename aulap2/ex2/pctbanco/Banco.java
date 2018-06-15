package pctbanco;

public class Banco {
  int qtdContas = 0;
  Conta[] vetConta = new Conta[10];
  public int abrirConta(int dep) {
    vetConta[qtdContas] = new Conta();
    vetConta[qtdContas].setSaldo(dep);
    vetConta[qtdContas].setId(++qtdContas);
    return qtdContas;
  }
  public void transacao(int id, int val) {
    if (val * -1 > vetConta[id - 1].getSaldo()) {
      System.out.println("ERRO");
    }
    else {
      vetConta[id - 1].setSaldo(vetConta[id - 1].getSaldo() + val);
    }
  }
  public void saldo(int id) {
    System.out.println("saldo = " + vetConta[id - 1].getSaldo());
  }
}
