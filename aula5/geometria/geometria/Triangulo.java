package geometria;

public class Triangulo extends Poligono {

	public Triangulo(double a, double b, double c) {
		super(new double[]{a, b, c});
		tipo = "Triangulo";
	}
	
	@Override
	public double area() {
		double p = perimetro() / 2.0;
		return Math.sqrt(p * (p - lados[0]) * (p - lados[1]) * (p - lados[2]));
	}
}