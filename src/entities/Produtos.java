package entities;

public class Produtos {

	private String nome;
	private Double preco;
	private Integer quantidade;

	public Produtos(String nome, Double preco, Integer quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public double totalValorEmEstoque() {
		return preco * quantidade;
	}

	public void addProdutos(Integer quantidade) {
		this.quantidade += quantidade;
	}

	public void removeProdutos(Integer quantidade) {
		this.quantidade -= quantidade;
	}

	public String toString() {
		return "Produto " + nome + ", $" + preco + ", " + quantidade + " unidade, Total: "
				+ String.format("%.2f", totalValorEmEstoque());
	}

}
