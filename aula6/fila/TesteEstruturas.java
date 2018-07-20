import estrutura.*;

public class TesteEstruturas {

	public static void main(String[] args) {

		System.out.println("--- Teste 1 ---");
		try {
			FilaSimples fila = new FilaAprimorada(3);
			fila.enfileira("10");
			fila.enfileira("20");
			fila.enfileira("30");
			fila.enfileira("40");
			System.out.println(fila.desenfileira());
			System.out.println(fila.desenfileira());
			System.out.println(fila.desenfileira());
			System.out.println(fila.desenfileira());

			System.out.println();
		} catch (FilaVaziaException e) {
			System.out.println(e);
		} catch (FilaCheiaException e) {
			System.out.println(e);
			System.out.println("Limite eh " + e.getLimite());
			System.out.println("Item eh " + e.getItem());
		}

		System.out.println();
		System.out.println("--- Teste 2 ---");

		try {
			FilaSimples fila = new FilaAprimorada(3);
			fila.enfileira("10");
			fila.enfileira("20");
			fila.enfileira("30");
			System.out.println(fila.desenfileira());
			System.out.println(fila.desenfileira());
			System.out.println(fila.desenfileira());
			System.out.println(fila.desenfileira());

			System.out.println();
		} catch (FilaVaziaException e) {
			System.out.println(e);
		} catch (FilaCheiaException e) {
			System.out.println(e);
			System.out.println("Limite eh " + e.getLimite());
			System.out.println("Item eh " + e.getItem());
		}

		System.out.println();
	}

}
