public class Primos {
    public static void main(String[] args) {
        
        try {
            // Construtor verifica se foi passado um primo valido,
            // caso contrario, lanca uma excecaoo
            NumeroPrimo n1 = new NumeroPrimo(17);
			NumeroPrimo n2 = new NumeroPrimo(5);
            
            System.out.println("n1 = " + n1.getValor());
            System.out.println("n2 = " + n2.getValor());
            // Por exemplo, aqui sera lancada uma excecao
            NumeroPrimo n3 = new NumeroPrimo(18);
			System.out.println("n3 = " + n3.getValor());
        } catch(Exception e) {
            System.out.println("Erro: " + e);
        }    
	}
}