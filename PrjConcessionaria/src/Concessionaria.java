import java.util.ArrayList;
public class Concessionaria {
	private String nome;
	private ArrayList<Veiculo> estoque;
	private ArrayList<Funcionario> funcionarios;
	
	
	public Concessionaria(String nome) {
		this.nome = nome;
	}
	
	public void adicionarVeiculo(String veiculo){
		ArrayList<String> veiculos = new ArrayList<>();
		
		veiculos.add(veiculo);
		
	}
	
	public void contratarFuncionario(String funcionario){
		ArrayList<String> funcionarios = new ArrayList<>();
		
		funcionarios.add(funcionario);
		
	}

}
