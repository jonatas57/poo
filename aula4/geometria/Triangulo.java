package geometria;

import java.lang.Math;

public class Triangulo extends Poligono {
  public Triangulo(double a, double b, double c) {
    super(new double[] {a, b, c});
    super.setTipo("Triangulo");
  }

  @Override
  public double area() {
    double semiPerimetro = super.perimetro() / 2, area = semiPerimetro;
    for (double lado : super.lados) {
      area *= semiPerimetro - lado;
    }
    area = Math.sqrt(area);
    return area;
  }

  @Override
  public String toString() {
    String s = "";
    return s.format("area = %.2f, perimetro = %.2f", this.area(), this.perimetro());
  }
}
