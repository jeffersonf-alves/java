package strings;

public class TrabalhandoComString {

	public static void main(String[] args) {
		String nome = "Jefferson Francisco Alves";
		
		String nomeEmMinusculo =  nome.toLowerCase();
		String nomeEmMasc =  nome.toUpperCase();
		String testeTrim = nome.trim();
		
		System.out.printf("Nome em minusculo: "+ nomeEmMinusculo);
		System.out.printf("\nNome em maisculo: "+ nomeEmMasc);
		System.out.print("\nTestando o Trim: " +testeTrim);

	}

}
