public class Numeros {
    public static void main(String[] args) {
        
        NumeroABC n1 = new NumeroABC(10);
        System.out.println("n1 = " + n1.getValor());
        
        NumeroABC n2 = new NumeroABC(5);
        System.out.println("n2 = " + n2.getValor());
        
        n1.soma(n2);
        System.out.println("n1 = n1+n2 -> " + n1.getValor());
        n1.soma(n2);
        System.out.println("n1 = n1+n2 -> " + n1.getValor());
        
        NumeroABC n3 = NumeroABC.soma(n1, n2);
        System.out.println("n3 = n1+n2 -> " + n3.getValor());
        
        n3.multiplica(n2);
        System.out.println("n3 = n3 * n2 -> " + n3.getValor());
        n3.multiplica(2);
        System.out.println("n3 = n3 * 2 -> " + n3.getValor());
        
        // Cria o número 1 (construtor default)
        NumeroABC n4 = new NumeroABC();
        n4.soma(n4);
        System.out.println("n4 = n4 + n4 -> " + n4.getValor());
        n4.multiplica(n4);
        System.out.println("n4 = n4 * n4 -> " + n4.getValor());
    }
}