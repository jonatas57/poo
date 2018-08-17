public class Aliens {

	public static void calculaResultado(int numero) {
		try {
			NumeroAlien n1 = new NumeroAlien(numero);
			System.out.println("Numero alien = " + numero);			
		} catch (NegativoException e) {
			System.out.println("Negativo: " + e.getNumero());
		}
	}

	public static void main(String[] args) {
		calculaResultado(-20);
		calculaResultado(507);
	}

}