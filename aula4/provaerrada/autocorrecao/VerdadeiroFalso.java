package autocorrecao;

public class VerdadeiroFalso extends Pergunta {

	public VerdadeiroFalso(String enunciado) {
		super(enunciado);
	}

	@Override
	public void imprimirPergunta() {
		System.out.println("Enunciado: " + super.enunciado);
		System.out.println("[ ] V ou F");
	}
}
