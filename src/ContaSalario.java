
public class ContaSalario extends Conta{

	public ContaSalario(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimeExtrato() {
		System.out.println("CONTA SALÁRIO");
		super.imprimeInfo();
	}

}
