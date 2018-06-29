package geometria;

public class Quadrado extends Retangulo {
  public Quadrado(double l) {
    super(l, l);
    super.setTipo("Circulo");
  }
  @Override
  public String toString() {
    String s = "";
    return s.format("area = %.2f, perimetro = %.2f", this.area(), this.perimetro());
  }
}
