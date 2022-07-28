package principal;

import dados.Pessoa;

public class Inicio {
	
	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setNome("João\n");
		pessoa1.setIdade(22);
		pessoa1.setTelefone("(11)1234-5678\n");
		
		Pessoa pessoa2 = new Pessoa("Pepson\n", "(37)99854-6789\n", 35);
		
		System.out.println(pessoa1.mostrarDados());
		System.out.println(pessoa2.mostrarDados());
		
		if (pessoa1.getIdade() > pessoa2.getIdade())
			System.out.println("A pessoa com maior idade é: " + pessoa1.getNome());
			else
			System.out.println("A pessoa com maior idade é: " + pessoa2.getNome());
		
		
		
		
		
	}

}
