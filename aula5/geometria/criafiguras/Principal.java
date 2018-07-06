package criafiguras;

import geometria.*;

public class Principal {

	public static void main (String[] args) {
		FiguraPlana c = new Circulo(3);
		FiguraPlana r = new Retangulo(3, 4);
		FiguraPlana q = new Quadrado(5);
		FiguraPlana t = new Triangulo(3, 4, 5);

		System.out.println(c);
		System.out.println(r);
		System.out.println(q);
		System.out.println(t);
	}

}
