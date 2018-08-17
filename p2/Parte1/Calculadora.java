public class Calculadora {
  private int quantidade;
  private ISoma[] contas;
  
  public Calculadora(int tamanho) {
    this.contas = new ISoma[10];
    this.quantidade = 0;
  }
  
  public void adicionarConta(ISoma conta) {
    this.contas[quantidade++] = conta;
  }
  
  public void imprimirTudo() {
    for (int i = 0;i < quantidade;i++) {
      this.contas[i].imprimirResultado();
    }
  }
}
