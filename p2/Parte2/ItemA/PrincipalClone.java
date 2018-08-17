public class PrincipalClone {

	public static void main(String[] args) {
		
		try {
			Professor profABC = new Professor("Paulo");
			
			Aluno a1 = new Aluno("Aluno1");
			Aluno a2 = new Aluno("Aluno2");
			Aluno a3 = new Aluno("Aluno123");
			
			Disciplina poo = new Disciplina("POO", profABC);
			poo.adicionarAluno(a1);		
			poo.adicionarAluno(a2);
			
			Disciplina pooCopia = poo.clone(); // Copia profunda de disciplina
			pooCopia.adicionarAluno(a3); // Adiciona aluno a3 apenas na copia
			
			profABC.setNome("Saul"); // Altera nome do professor de POO (mas nao deveria alterar na copia)
			
			poo.imprimir();
			pooCopia.imprimir();
		} catch (Exception e) {
			System.out.println("Erro: " + e);
		}
	}

}