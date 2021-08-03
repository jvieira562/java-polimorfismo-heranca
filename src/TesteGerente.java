
public class TesteGerente {

	public static void main(String[] args) {

		Gerente victor = new Gerente();

		victor.setNome("Vieira Santos Victor José");
		victor.setCpf("097.864.978-00");
		victor.setSalario(5250.50);
		victor.setSenha(1234);

		boolean autenticou = victor.autentica(1234);

		double salarioTotal = victor.getSalario() + victor.getBonificacao();

		System.out.println("===================================================="
				+ "=============================================================");
		System.out.println(" NOME: 		" + victor.getNome());
		System.out.println(" CPF: 		" + victor.getCpf());
		System.out.println(" SALARIO FIXO: 	" + victor.getSalario() + " R$");
		System.out.println(" BONIFICACAO:	" + victor.getBonificacao() + " R$");
		System.out.println(" SALARIO FINAL:	" + salarioTotal + " R$");

		System.out.println("\n SENHA: 	" + autenticou);
		System.out.println("===================================================="
				+ "=============================================================");

	} 
}
