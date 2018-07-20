public class Conta {
  private String nome;
  private double saldo;
  private double limite;

  public Conta(String nome) {
    this.nome = nome;
    this.saldo = 0;
    this.limite = 0;
  }

  public void depositar(double deposito) {
    this.saldo += deposito;
  }

  public double sacar(double saque) throws SaldoInsuficienteException {
    if (this.saldo + this.limite >= saque && saque > 0) {
      this.saldo -= saque;
      return saque;
    }
    throw new SaldoInsuficienteException(saldo + limite);
  }

  public void setLimite(double limite) {
    this.limite = limite;
  }

  @Override
  public String toString() {
    return this.nome + " tem " + this.saldo;
  }
}
