
public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario vieira = new Funcionario();
		
		vieira.setNome("José Victor Santos Vieira");
		vieira.setCpf("097.864.978-00");
		vieira.setSalario(2250.50);
		
		System.out.println(" NOME: " + vieira.getNome());
		System.out.println("CPF: " + vieira.getCpf());
		System.out.println("SALARIO: " + vieira.getSalario());
		System.out.println("BONIFICACAO" + vieira.getBonificacao());
	}
}
