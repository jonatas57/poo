package processos;

public class GerenciadorProcessos {

	private Processo[] listaProcessos;
	private int quantidade = 0;

	public GerenciadorProcessos(int tamanho) {
		this.listaProcessos = new Processo[tamanho];
	}
	
	public void adicionarProcesso(Processo processo) {
		listaProcessos[quantidade++] = processo;
	}

	public void imprimirProcessos() {
		for (Processo processo : listaProcessos) {
			if (processo != null) {
				System.out.println("[" + processo.getTipo() + "] " + processo.toString());
			}
		}
	}
}
