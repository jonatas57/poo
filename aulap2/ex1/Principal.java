import universidade.Pessoa;

public class Principal {
  public static void main(String[] args) {
    Pessoa joao = new Pessoa(), maria = new Pessoa();
    joao.setNome("Joao");
    joao.setCpf("46573519545");
    maria.setNome("Maria");
    maria.setCpf("41564865412");
    joao.print();
    maria.print();
  }
}
