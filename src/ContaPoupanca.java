
public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}
	
	public void imprimeExtrato() {
		System.out.println("CONTA POUPANÇA");
		super.imprimeInfo();
	}
	
	@Override
	public void saca(double valor) {
		if (valor > this.saldo) {
			System.out.println("A conta poupança não permite saques maiores do que o saldo.");
			return;
		}
		this.saldo -= valor;
	}
}
