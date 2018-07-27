public class Penalty {

	private static int contagem = 0;

	private Goleiro goleiro;
	private Cobrador cobrador;

	public Penalty(Goleiro goleiro, Cobrador cobrador) {
		this.goleiro = goleiro;
		this.cobrador = cobrador;
	}

	// Retorna true se a cobrança for convertida em gol
	public boolean cobrar() {
		System.out.println("--- Penalty " + ++contagem + " ---");

		int ladoChute = cobrador.chutar();
		int ladoDefesa = goleiro.defender();

		System.out.println();

		return (ladoChute != ladoDefesa); // Bola entra se o goleiro pular para o lado diferente de onde a bola foi chutada
	}

}
