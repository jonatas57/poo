public class CaminhaoGenerico<T> {
	
	private T itemGrande;
	private T itemMedio;
	
	public void guardaItemGrande(T item) {
		this.itemGrande = item;
	}

	public void guardaItemMedio(T item) {
		this.itemMedio = item;
	}

	@Override
	public String toString() {
		return "Caminhao: " + itemGrande + "; " + itemMedio;
	}	
}
