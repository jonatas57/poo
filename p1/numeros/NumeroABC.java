public class NumeroABC {
	private int valor;
	
	public NumeroABC() {
		this(1);
	}

	public NumeroABC(int valor) {
		this.setValor(valor);
	}

	public int getValor() {
		return this.valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public NumeroABC soma(NumeroABC numero) {
		this.setValor(this.getValor() + numero.getValor());
		return this;
	}

	public static NumeroABC soma(NumeroABC numeroA, NumeroABC numeroB) {
		return numeroA.soma(numeroB);
	}

	public void multiplica(NumeroABC numero) {
		this.setValor(this.getValor() * numero.getValor());
	}

	public void multiplica(int numero) {
		this.multiplica(new NumeroABC(numero));
	}

}
