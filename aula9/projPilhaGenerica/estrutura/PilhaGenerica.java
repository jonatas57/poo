package estrutura;

import java.util.ArrayList;

public class PilhaGenerica<E> {

	private int topo, tamanhoMax;
	private ArrayList<E> itens;

	public PilhaGenerica(int tamanhoMax) {
		this.itens = new ArrayList<E>(tamanhoMax); // Este construtor de ArrayList define um tamanho inicial para o array
		this.topo = -1;
		this.tamanhoMax = tamanhoMax;
	}

	public void empilha(E novoItem) {
		if (getTopo() == getTamanhoMax() - 1)
			throw new PilhaCheiaException(getTamanhoMax(), novoItem);

		itens.add(++topo, novoItem);
	}

	public E desempilha() {
		// verificar pilha vazia
		if (getTopo() == -1)
			throw new PilhaVaziaException();

		E item = itens.get(topo);
		itens.remove(topo--);
		return item;
	}

	int getTopo() {
		return this.topo;
	}

	int getTamanhoMax() {
		return this.tamanhoMax;
	}
}
