import java.util.ArrayList;
import java.util.List;

public class Banco {
	private List<Conta> listaDeContas;
	
	public Banco() {
		this.listaDeContas = new ArrayList<>();
	}
	
	public void adicionaConta(Conta conta) {
		if(contaValida(conta)) {
			this.listaDeContas.add(conta);
			return;
		}
		System.out.println("Conta inválida.");
	}
	
	public boolean contaValida(Conta conta) {
		if (conta.getCliente() == null && conta.getNumero() <= 0) {
			return false;
		}
		return true;
	}
	
	public List<Conta> getListaContas() {
		return this.listaDeContas;
	}
	
	
}
