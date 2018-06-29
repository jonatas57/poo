package geometria;

import java.lang.Math;

public class Circulo extends Figura {
  private double raio;

  public Circulo(double raio) {
    this.raio = raio;
    super.setTipo("Circulo");
  }

  public double getRaio() {
    return this.raio;
  }

  @Override
  public double area() {
    return Math.PI * this.getRaio() * this.getRaio();
  }

  @Override
  public double perimetro() {
    return 2 * Math.PI * this.getRaio();
  }

  @Override
  public String toString() {
    String s = "";
    return s.format("%sarea = %.2f, perimetro = %.2f", super.toString(), this.area(), this.perimetro());
  }
}
