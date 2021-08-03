
public class TesteContas {

	public static void main(String[] args) {

		ContaCorrente jose = new ContaCorrente(31305, 10053137);
		jose.deposita(150);
		
		ContaPoupanca victor = new ContaPoupanca(4132, 22043769);
		victor.deposita(200);

	}

}
