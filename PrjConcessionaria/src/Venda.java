import java.util.Date;

public class Venda {
	 private Date data;
	    private double valorFinal;

	    private Cliente cliente;
	    private Vendedor vendedor;
	    private Veiculo veiculo;
	    
	    
	    public Venda(Cliente cliente, Vendedor vendedor, Veiculo veiculo) {
	        this.data = new Date();
	        this.cliente = cliente;
	        this.vendedor = vendedor;
	        this.veiculo = veiculo;
	        this.valorFinal = veiculo.getPreco();
	    }
	    
	    public void finalizarVenda() {
	        veiculo.vender();

	        System.out.println("Venda finalizada!");
	        System.out.println("Cliente: " + cliente.getNome());
	        System.out.println("Vendedor: " + vendedor.getNome());
	        System.out.println("Veículo: " + veiculo.getModelo());
	        System.out.println("Valor: R$" + valorFinal);
	    }
}
