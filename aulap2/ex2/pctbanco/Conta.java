package pctbanco;

class Conta {
  int id, saldo;
  public void setId(int id) {
    this.id = id;
  }
  public void setSaldo(int saldo) {
    this.saldo = saldo;
  }
  public int getId() {
    return id;
  }
  public int getSaldo() {
    return saldo;
  }
  public void imprimirSaldo() {
    System.out.println("id = " + this.id);
    System.out.println("saldo = " + this.saldo);
  }
}
