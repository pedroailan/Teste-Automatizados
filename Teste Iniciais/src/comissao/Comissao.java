package comissao;

public class Comissao {
	
	private int total;
	
	public int getTotal() {
		return total;
	}
	
	public void inicializaTotal() {
		this.total = 0;
	}
	
	public void adiciona(int valor) {
		this.total += valor;
	}
}
