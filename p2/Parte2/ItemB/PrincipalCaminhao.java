import objetos.*;

public class PrincipalCaminhao {
	public static void main(String[] args) {		
		CaminhaoGenerico<Eletronico> c1 = new CaminhaoGenerico<Eletronico>();
		
		c1.guardaItemMedio(new Tablet());
		c1.guardaItemGrande(new Notebook());		
		System.out.println(c1);
	}
}
