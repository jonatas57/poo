public class SomaSimples implements ISoma {
  private int parcela1, parcela2, resultado;
  
  public SomaSimples(int a, int b) {
    this.parcela1 = a;
    this.parcela2 = b;
    this.resultado = a + b;
  }
  
  @Override
  public void imprimirResultado() {
    System.out.println("Soma simples:");
    System.out.println("R=" + this.resultado);  
  }
}
