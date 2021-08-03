
public class ControleBonificacao {

	private double soma;

	public void registra(Funcionario vieiraGerente) {

		double bonificacao = vieiraGerente.getBonificacao();
		this.soma = this.soma + bonificacao;

	}

	public double getSoma() {
		return soma;
	}

}
