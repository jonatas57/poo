package processos;

public class ProcessoEspecial extends Processo {
	
		private String nome;

	public ProcessoEspecial(String nome) {
		super("Processo especial");
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return this.nome;
	}
}
