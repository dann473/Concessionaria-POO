import java.util.ArrayList;
public class Concessionaria {
	private String nome;
	private ArrayList<Veiculo> estoque;
	private ArrayList<Funcionario> funcionarios;
	
	
	public Concessionaria(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<Veiculo> getEstoque() {
		return estoque;
	}

	public void setEstoque(ArrayList<Veiculo> estoque) {
		this.estoque = estoque;
	}

	public ArrayList<Funcionario> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
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
