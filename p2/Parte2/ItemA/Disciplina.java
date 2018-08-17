public class Disciplina implements Cloneable {

	private String nomeDisciplina;
	private Professor prof;
	private Aluno[] listaAlunos = new Aluno[10];
	private int indiceAtual = 0;
	
	public Disciplina(String nomeDisciplina, Professor professor) {
		this.nomeDisciplina = nomeDisciplina;
		this.prof = professor;
	}
	
	public void adicionarAluno(Aluno novoAluno) {
		listaAlunos[indiceAtual++] = novoAluno;
	}
	
	public void imprimir() {
		System.out.println("-----------------------------");
		System.out.println("Disciplina: " + nomeDisciplina);
		System.out.println("Professor: " + prof.getNome());
		System.out.println("Alunos: ");
		for (Aluno aluno : listaAlunos)
			if (aluno != null)
				System.out.println(aluno.getNome());
	}
	
	public Disciplina clone() throws CloneNotSupportedException {
	  Disciplina clonada = (Disciplina) super.clone();
	  clonada.prof = new Professor(this.prof.getNome());
	  clonada.listaAlunos = new Aluno[10];
	  for (int i = 0;i < 10;i++) {
	    if (this.listaAlunos[i] != null) {
	 	    clonada.listaAlunos[i] = new Aluno(this.listaAlunos[i].getNome());
	 	  }
	  }
	  return clonada;
	}

}
