
public class Cliente {

	public String nome;
	public String cpf;
	
	public Cliente(String nome, String cpf) {
		this.setNome(nome);
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}
}
