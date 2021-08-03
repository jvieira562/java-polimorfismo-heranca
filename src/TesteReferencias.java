
public class TesteReferencias {

	public static void main(String[] args) {

		Funcionario vieiraGerente = new Gerente();
		Funcionario vieiraFuncionario = new Funcionario();
		Funcionario editorV = new EditorVideo();

		vieiraGerente.setNome("José Victor Gerente");
		vieiraGerente.setSalario(4000.00);

		vieiraFuncionario.setSalario(1000.00);

		ControleBonificacao controle = new ControleBonificacao();

		controle.registra(editorV);
		controle.registra(vieiraGerente);
		controle.registra(vieiraFuncionario);

		System.out.println(controle.getSoma());

	}

}
