
public class ContaSalario extends Conta{

	public ContaSalario(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimeExtrato() {
		System.out.println("CONTA SALÁRIO");
		super.imprimeInfo();
	}
	
	@Override
	public void saca(double valor) {
		if (valor > this.saldo) {
			System.out.println("Saldo insuficiente.\nContas do tipo salário não tem limite.");
			return;
		}
		this.saldo -= valor;
	}

}
