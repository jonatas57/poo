package processos;

public abstract class Processo {
	
	private String tipo;

	public Processo(String tipo) {
		this.tipo = tipo;
	}
	
	public String getTipo() {
		return this.tipo;
	}

	public abstract String toString();
}
