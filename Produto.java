package funcoesLambdas;

public class Produto {

	final String nome;
	final double preco;
	final double desconto;
	
	
	public Produto(String nome, double preco, double desconto) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
		
	}
	
	public double valorDaCompra() {
		
		double totalDaCompra = preco * (1 - desconto);
		
		if (totalDaCompra < 2500.00) {
			totalDaCompra = totalDaCompra + 50.00;
		} else if ( totalDaCompra >= 2500.00 && totalDaCompra < 3000.00) {
			totalDaCompra = totalDaCompra * (1 + 0.085) + 50.00;
		} else if (totalDaCompra >= 3000.00) {
			totalDaCompra = totalDaCompra * (1 + 0.085) + 100.00;			
		}
		
		return totalDaCompra;
	}
	
	public String toString() {
		return nome + " tem o preço de R$" + String.format("%2f", valorDaCompra()); 
	}
	
}
