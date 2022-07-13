
public class Main {

	public static void main(String[] args) {
		
		Cliente cli1 = new Cliente("Tarcio Vinicius Nieri", "123.456.789.10");
		
		
		Conta c1 = new ContaCorrente(cli1);
		c1.deposita(1000.0);
		c1.imprimeExtrato();

		Conta c2 = new ContaPoupanca(cli1);
		c2.deposita(500.0);
		c2.imprimeExtrato();

		c1.transfere(100, c2);

		c1.imprimeExtrato();
		c2.imprimeExtrato();

	}

}
