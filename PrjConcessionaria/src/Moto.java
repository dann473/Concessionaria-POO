
public class Moto extends Veiculo {

	private int cilindradas;
	
	public int getCilindradas() {
		return cilindradas;
	}

	public void setCilindradas(int cilindradas) {
		this.cilindradas = cilindradas;
	}

	public Moto(String modelo, String marca, Double preco, int cilindradas) {
		super(modelo, marca, preco);
		this.cilindradas = cilindradas;
	}

	public void exbirInfo() {
		
	}

}
