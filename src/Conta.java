
public abstract class Conta implements IConta {

	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;

	protected int agencia;
	protected int numero;
	protected Cliente titular;
	protected double saldo;

	public Conta(Cliente cliente) {
		this.agencia = AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.titular = cliente;
	}

	@Override
	public void saca(double valor) {
		this.saldo -= valor;

	}

	@Override
	public void deposita(double valor) {
		this.saldo += valor;

	}

	@Override
	public void transfere(double valor, IConta contaDestino) {
		this.saca(valor);
		contaDestino.deposita(valor);
	}
	
	protected void imprimeInfo( ) {
		System.out.println("Titular: " + this.titular.getNome());
		System.out.println("Agência: " + this.agencia);
		System.out.println("Numero: " + this.numero);
		System.out.println("Saldo: " + this.saldo);
		System.out.println();
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public Cliente getCliente() {
		return titular;
	}
}
