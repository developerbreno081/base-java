package entities;

public class Produto {
	public String nome;
	public double preco;
	public int quantidade;
	
	public double totalEmEstoque() {
		double total = preco * quantidade;
		return total;
	}

	public void addProdutos (int quantidade) {
		 this.quantidade += quantidade;
	}
	
	public void removeProdutos (int quantidade) {
		this.quantidade -= quantidade;
	}
	
}
