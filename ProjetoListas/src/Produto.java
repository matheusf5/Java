package entities;

public class Produto {
		
	private Integer codigo;
	private String nome;
	private Double preco;
	
	public Produto(Integer codigo, String nome, Double preco) {
		this.codigo = codigo;
		this.nome = nome;
		this.preco = preco;
	}
	
	public Produto(String nome, Double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	public Integer getCodigo() {
		return codigo;
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
	
	public void setPreco(double preco) {
		this.preco = preco;
	}

	public void desconto(double porcentagem) {
		preco -= (preco * porcentagem ) / 100;
	}
	
	public String toString() {
		return "Código: " + codigo
		         + ", Nome: " + nome
		         + ", Preço: " + String.format("%.2f", preco);
	}
	
	
	
	
	
	
	
	
	
}
