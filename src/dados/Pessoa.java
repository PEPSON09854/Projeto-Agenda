package dados;

public class Pessoa {
	
	private String nome;
	private String telefone;
	private int idade;
	
	public Pessoa() {
		
		this("", "", 0);
	}
	
	public Pessoa(String nom, String tel, int id) {
		
		setNome(nom);
		setTelefone(tel);
		setIdade(id);
		
	}
	
	public Pessoa(Pessoa nova) {
		
		this(nova.getNome(), nova.getTelefone(), nova.getIdade());
		
	}
	
	public boolean testeIdade(int idade) {
		
		if(idade > 0) return true;	
		else return false;
		
	}
	
	public String mostrarDados() {
		
		String retorno = "Nome: " + getNome() + "Idade: " + 
		getIdade() + "\nTelefone: " + getTelefone();
		return retorno;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
		if (testeIdade(idade))
			this.idade = idade;
			else
			this.idade = 0;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	

}
