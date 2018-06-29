package geometria;

public class Figura {
  protected String tipo = "?";

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }
  public String getTipo() {
    return this.tipo;
  }

  public double perimetro() {
    return 0.0;
  }
  public double area() {
    return 0.0;
  }
  public String toString() {
    String s = "";
    return s.format("%s: ", this.getTipo());
  }
}
