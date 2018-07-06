package geometria;

public abstract class Poligono extends FiguraPlana {

	protected double[] lados;

	public Poligono(double[] lados) {
		this.lados = lados;
	}

	@Override
	public double perimetro() {
		double soma = 0.0;
		for (double elemento : lados)
			soma += elemento;
		return soma;
	}

}
