package processos;

public class TarefaSimples extends Processo {
	
	private String nome;
	private int memoria;
	
	public TarefaSimples(String nome, int memoria) {
		super("Tarefa Simples");
		this.nome = nome;
		this.memoria = memoria;
	}

	public TarefaSimples() {
		this("Sleep", 0);
	}
	
	@Override
	public String toString() {
		return this.nome + " (memoria=" + this.memoria + ")";
	}
}
