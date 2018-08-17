public class SomaVertical implements ISoma {
  private int parcela1, parcela2, resultado;
  
  public SomaVertical(int a, int b) {
    this.parcela1 = a;
    this.parcela2 = b;
    this.resultado = a + b;
  }
  
  @Override
  public void imprimirResultado() {
    System.out.println("Soma vertical:");
    System.out.println(this.parcela1 + "\n+\n" + this.parcela2 + "\n-----\n" + this.resultado);  
  }
}
