package geometria;

public class Poligono extends Figura {
  protected double[] lados;

  public Poligono(double[] lados) {
    this.lados = lados;
  }

  @Override
  public double perimetro() {
    double soma = 0;
    for (double lado : this.lados) {
      soma += lado;
    }
    return soma;
  }

  @Override
  public double area() {
    return this.lados[0] * this.lados[1];
  }

  public void setLados(double[] lados) {
    this.lados = lados;
  }
}
