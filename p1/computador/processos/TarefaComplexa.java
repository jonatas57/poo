package processos;


public class TarefaComplexa extends Processo {

	private String nome;
	private int memoria;	

	public TarefaComplexa(String nome, int memoria) {
		super("Tarefa complexa");
		this.nome = nome;
		this.memoria = memoria;
	}
	
	@Override
	public String toString() {
		return this.nome + " (memoria=" + this.memoria + ")";
	}

}	
