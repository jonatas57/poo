public class SomaEquacao implements ISoma {
  private int parcela1, parcela2, resultado;
  
  public SomaEquacao(int a, int b) {
    this.parcela1 = a;
    this.parcela2 = b;
    this.resultado = a + b;
  }
  
  @Override
  public void imprimirResultado() {
    System.out.println("Soma equacao:");
    System.out.println(this.parcela1 + " + " + this.parcela2 + " = " + this.resultado);  
  }
}
