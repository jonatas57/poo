public class Treino {

	public static Goleiro criaGoleiro(String tipoGoleiro) {
		if (tipoGoleiro.equals("P")) {
			return new GoleiroPessoa("Paulo");
		}
		else {
			return new GoleiroIA("Paulo");
		}
	}
	public static Cobrador criaCobrador(String tipoCobrador) {
		if (tipoCobrador.equals("P")) {
			return new CobradorPessoa("Saul");
		}
		else {
			return new CobradorIA("Saul");
		}
	}

	public static void main(String[] args) {

		Cobrador cobrador = criaCobrador(args[0]);
		Goleiro goleiro = criaGoleiro(args[1]);

		Penalty p = new Penalty(goleiro, cobrador);

		int acertosCobrador = 0;
		int defesas = 0;

		for (int i = 0; i < 3; i++)
			if (p.cobrar())
				acertosCobrador++;
			else
				defesas++;

		System.out.println("[" + ((Jogador) cobrador).getNome() + "] Gols = " + acertosCobrador
						+ "  [" + ((Jogador) goleiro).getNome() + "] Defesas = " + defesas);
	}

}
