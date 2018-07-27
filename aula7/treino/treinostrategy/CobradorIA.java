import java.util.Scanner;
import java.util.Random;

public class CobradorIA extends Jogador implements Cobrador {

	private Random random;

	public CobradorIA(String nome) {
		super(nome);
		random = new Random();
	}

	@Override
	public int chutar() {
		int escolha = random.nextInt(3) + 1;
		return escolha;
	}

}
