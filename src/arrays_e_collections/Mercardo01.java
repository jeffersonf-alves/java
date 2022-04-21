package arrays_e_collections;
import java.util.ArrayList;
import java.util.Scanner;



public class Mercardo01 {
	
	static ArrayList<String> produtos = new ArrayList<>();
	static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		boolean opcao01 = true;
		do {
			System.out.println("Deseja adicionar um Produto? 1-Sim 2-Não");
			int op = teclado.nextInt();
			
			if(op > 2) {
				System.out.print("Opção não é válida");
			}
			if(op == 1) {
				AdicionarProduto();
			}
			if(op == 2) {
				System.out.print("Obrigado!");
				opcao01 = false;
			}
		} while(opcao01);
		
		for(String produto: produtos) {
			System.out.println(produto);
		}

	}
	public static void AdicionarProduto() {
		System.out.println("Digite o nome do produto: ");
		produtos.add(teclado.next());
		
	}
	
	

}
