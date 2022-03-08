package classes_e_metodos;

public class Produto {
	
	String nome;
	double preco;
	double desconto;
	
	
	Produto(String nomeInicial) {
		nome = nomeInicial;
	}
	
	Produto() {
		
	}
	
	
	double precoComDesconto(double descontoDoGerente) {
		return preco * (1 - desconto);
	}
	
}
