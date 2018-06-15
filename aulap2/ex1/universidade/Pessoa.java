package universidade;

public class Pessoa {
  private String cpf, nome;
  public String getNome() {
    return nome;
  }
  public String getCpf() {
    return cpf;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }
  public void print() {
    System.out.printf(this.getNome() + " = " + this.getCpf() + "\n");
  }
}
