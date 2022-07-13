
public class Main {

	public static void main(String[] args) {
		Banco b1 = new Banco();
		
		Cliente cli1 = new Cliente("Tarcio Vinicius Nieri", "123.456.789.10");
		Cliente cli2 = new Cliente("João da Silva", "987.654.321.10");
		
		
		Conta c1 = new ContaCorrente(cli1);
		b1.adicionaConta(c1);
		c1.deposita(1000.0);
		c1.imprimeExtrato();

		Conta c2 = new ContaPoupanca(cli2);
		b1.adicionaConta(c2);
		c2.deposita(500.0);
		c2.imprimeExtrato();

		c1.transfere(100, c2);

		c1.imprimeExtrato();
		c2.imprimeExtrato();
		
		System.out.println("Testa Limite CC");
		c1.saca(5000);
		
		Conta c3 = new ContaSalario(cli1);
		b1.adicionaConta(c3);
		
		
		System.out.println();
		System.out.println("--- Contas do banco ---");
		for (Conta c : b1.getListaContas()) {
			c.imprimeInfo();
		}

	}

}
