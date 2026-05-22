
public abstract class Veiculo {
	private String modelo;
	private String marca;
	private Double preco;
	private Boolean vendido;
	
	public Veiculo(String modelo, String marca, Double preco) {
		this.modelo = modelo;
		this.marca = marca;
		this.preco = preco;
		this.vendido = false;
	}

	public String getModelo() {
		return modelo;
	}

	public String getMarca() {
		return marca;
	}

	public Double getPreco() {
		return preco;
	}

	public boolean isVendido() {
		return vendido;
	}
	
	public void vender() {
		this.vendido = true;
	}
	
	public abstract void exbirInfo();
	
}
