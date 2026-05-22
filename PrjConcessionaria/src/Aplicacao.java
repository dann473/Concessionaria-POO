import javax.swing.JOptionPane;

public class Aplicacao {
	public static void main(String[] args) {
		
		
		// CONCESSIONARIA - CONSTRUTOR
		String nomeConcessionaria = JOptionPane.showInputDialog(null, "Digite o Nome da Concessionaria:");
		JOptionPane.showMessageDialog(null, "Nome da Concessionaria: " + nomeConcessionaria);
		
		Concessionaria c1 = new Concessionaria(nomeConcessionaria);
		c1.setNome(nomeConcessionaria);
		
		// FUNCIONARIO - CONSTRUTOR
		String nomeFuncionario = JOptionPane.showInputDialog(null, "Digite o Nome do Funcionario:");
		String cpfFuncionario = JOptionPane.showInputDialog(null, "Digite o CPF do Funcionario:");
		double salarioFuncionario = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o Salario do Funcionario:"));
		
		JOptionPane.showMessageDialog(null, "Nome do Funcionario: " + nomeFuncionario);
		JOptionPane.showMessageDialog(null, "CPF do Funcionario: " + cpfFuncionario);
		JOptionPane.showMessageDialog(null, "Salario do Funcionario: " + salarioFuncionario);
		
		Funcionario f1 = new Funcionario(nomeFuncionario, cpfFuncionario, salarioFuncionario);
		f1.setNome(nomeFuncionario);
		f1.setCpf(cpfFuncionario);
		f1.setSalario(salarioFuncionario);
		
		// CARRO - CONSTRUTOR
		String modeloCarro = JOptionPane.showInputDialog(null, "Digite o Modelo Do Carro: ");
		String marcaCarro = JOptionPane.showInputDialog(null, "Digite a Marca Do Carro: ");
		double precoCarro = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o Preço Do Carro: "));
		int portasCarro = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o Número de Portas Do Carro: "));
		
		JOptionPane.showMessageDialog(null, "Modelo do Carro: " + modeloCarro);
		JOptionPane.showMessageDialog(null, "Preço do Carro " + precoCarro);
		JOptionPane.showMessageDialog(null, "Marca do Carro: " + marcaCarro);
		JOptionPane.showMessageDialog(null, "Numeros de Portas: " + portasCarro);
		
		Carro v1 = new Carro(modeloCarro, marcaCarro, precoCarro,  portasCarro);
		
		v1.setPortas(portasCarro);
		
		
		
	}

}
