package estrutura;

import objetos.Eletronico;

public class PilhaE implements Cloneable {

	private int topo;
	private Eletronico[] itens;

	public PilhaE(int tamanhoMax) {
		this.itens = new Eletronico[tamanhoMax];
		this.topo = -1;
	}

	public void empilha(Eletronico novoItem) {
		if (getTopo() == getTamanhoMax() - 1)
			throw new PilhaCheiaException(getTamanhoMax(), novoItem);

		itens[++topo] = novoItem;
	}

	public Eletronico desempilha() {
		// verificar pilha vazia
		if (getTopo() == -1)
			throw new PilhaVaziaException();

		Eletronico item = itens[topo];
		itens[topo--] = null;
		return item;
	}

	int getTopo() {
		return this.topo;
	}

	int getTamanhoMax() {
		if (itens != null)
			return this.itens.length;
		else
			return -1;
	}

	@Override
	public PilhaE clone() throws CloneNotSupportedException {
		PilhaE clonada = (PilhaE) super.clone();
		clonada.itens = new Eletronico[this.itens.length];
		for (int i = 0;i < this.itens.length && this.itens[i] != null;i++) {
			clonada.empilha(this.itens[i].clone());
		}
		return clonada;
	}

}
