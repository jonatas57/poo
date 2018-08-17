public class PrincipalStrategy {
	public static void main(String[] args) {
		ISoma s1 = new SomaSimples(2, 4);
		ISoma s2 = new SomaVertical(5, 2);
		ISoma s3 = new SomaEquacao(6, 2);

		// 10 eh o tamanho maximo do vetor
		Calculadora calc = new Calculadora(10);
		calc.adicionarConta(s1);
		calc.adicionarConta(s2);
		calc.adicionarConta(s3);

		calc.imprimirTudo();
	}
}