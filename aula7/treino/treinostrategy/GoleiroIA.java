import java.util.Scanner;
import java.util.Random;

public class GoleiroIA extends Jogador implements Goleiro {

	private Random random;

	public GoleiroIA(String nome) {
		super(nome);
		random = new Random();
	}
	@Override
	public int defender() {
		int escolha = random.nextInt(3) + 1;
		return escolha;
	}

}
