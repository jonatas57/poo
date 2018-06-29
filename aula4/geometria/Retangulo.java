package geometria;

public class Retangulo extends Poligono {
  public Retangulo(double w, double h) {
    super(new double[] {w, h, w, h});
    super.setTipo("Retangulo");
  }

  @Override
  public String toString() {
    String s = "";
    return s.format("area = %.2f, perimetro = %.2f", this.area(), this.perimetro());
  }
}
