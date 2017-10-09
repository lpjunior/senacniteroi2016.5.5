package entidade;

// POJO - Plain Old Java Object
public class Produto {

	private Long id; // � maior int
	private String nmProduto;
	private String descProduto;
	private Double preco; // � maior q float
	private Integer quantidade;
	
	public Produto() {

	}

	@Override
	public String toString() {
		return id + "\n " + nmProduto + "\n " + descProduto + "\n " + preco + "\n " + quantidade;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNmProduto() {
		return nmProduto;
	}

	public void setNmProduto(String nmProduto) {
		this.nmProduto = nmProduto;
	}

	public String getDescProduto() {
		return descProduto;
	}

	public void setDescProduto(String descProduto) {
		this.descProduto = descProduto;
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
}
