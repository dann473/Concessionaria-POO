
public class Carro extends Veiculo {

	private int portas;
	
	public Carro(String modelo, String marca, Double preco, int portas) {
		super(modelo, marca, preco);
		this.portas = portas;
	}

	public int getPortas() {
		return portas;
	}

	public void setPortas(int portas) {
		this.portas = portas;
	}

	public void exbirInfo() {		
		
	}
	
	
}
