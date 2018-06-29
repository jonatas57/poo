package criafigura;

import geometria.Figura;

public class CriarFigura {
  public static void main(String[] args) {
    Figura[] figuras = new Figura[4];

    figuras[0] = new Quadrado(9);
    figuras[1] = new Retangulo(5, 10);
    figuras[0] = new Triangulo(3, 4, 5);
    figuras[0] = new Circulo(5);

    for (Figura figura : figuras) {
      System.out.println(figura.toString());
    }
  }
}
