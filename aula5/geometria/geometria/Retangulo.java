package geometria;

public class Retangulo extends Poligono {

	public Retangulo(double a, double b) {
		super(new double[]{a, b, a, b});
		tipo = "Retangulo";
	}
	
	@Override
	public double area() {
		return lados[0] * lados[1];
	}

}