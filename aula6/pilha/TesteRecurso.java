import estrutura.*;
import recurso.*;

public class TesteRecurso {

	public static void main(String[] args) {

		System.out.println("--- Teste 1 ---");
		try (PilhaRecurso pilha = new PilhaRecurso(4)) {
			pilha.empilha("10");
			pilha.empilha("20");
			pilha.empilha("30");
			pilha.empilha("40");
			System.out.println(pilha.desempilha());
			System.out.println(pilha.desempilha());

			System.out.println();
		}
		finally {
			try {
				pilha.desempilha();
			}
			catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}
