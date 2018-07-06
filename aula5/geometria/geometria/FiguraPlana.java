package geometria;

public abstract class FiguraPlana {

	protected String tipo = "?";

	public abstract double perimetro();
	public abstract double area();

	@Override
	public String toString() {
		return "Tipo: " + tipo + " P=" + perimetro() + " A=" + area();
	}

	public void imprimir() {
		System.out.println(this);
	}

}
