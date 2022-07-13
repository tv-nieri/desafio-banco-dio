
public class ContaCorrente extends Conta {

	private double limite = 0.1;

	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimeExtrato() {
		System.out.println("CONTA CORRENTE");
		super.imprimeInfo();

	}
	
	@Override
	public void saca(double valor) {
		if (valor <= this.getSaldoMaisLimite()) {
			this.saldo -= valor;
			return;
		}
		System.out.println("Não foi possível realizar o saque");
		this.valorMaiorSaldo();
	}

	public double getLimite() {
		return this.limite;
	}

	public double getSaldoMaisLimite() {
		return this.saldo + (this.saldo * limite);
	}

	private void valorMaiorSaldo() {
		System.out.println("Saldo: " + this.saldo);
		System.out.println("Limite (%): " + (limite * 100));
		System.out.println("Saldo + Limite: " + this.getSaldoMaisLimite());
	}

}
