import processos.*;

public class SuperComputador {
    public static void main(String[] args) {
        // O argumento 10 eh o numero maximo de itens na lista de processos
        GerenciadorProcessos gerenciador = new GerenciadorProcessos(10);
        
        // Os argumentos 11, 5 e 99999 são a quantidade 
  // de memória alocada para cada tarefa
        Processo e1 = new TarefaSimples("Impares", 11);        
        Processo e2 = new TarefaSimples("Primos", 5);  
        Processo e3 = new TarefaComplexa("P = NP?", 99999);
        
        // Um processo especial pode usar toda a memória disponível 
  // (não há um limite), por isso esse parâmetro é ignorado aqui
        Processo e4 = new ProcessoEspecial("Sistema Operacional");
        
        // Cria uma tarefa vazia (sleep)
        Processo e5 = new TarefaSimples();
        gerenciador.adicionarProcesso(e1);
        gerenciador.adicionarProcesso(e2);
        gerenciador.adicionarProcesso(e3);
        gerenciador.adicionarProcesso(e4);
        gerenciador.adicionarProcesso(e5);
        
        gerenciador.imprimirProcessos();
    }   
}