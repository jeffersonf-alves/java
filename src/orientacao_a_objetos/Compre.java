package orientacao_a_objetos;

import java.util.ArrayList;

public class Compre {
	
	String cliente;
	ArrayList<Item> itens = new ArrayList<Item>();
	
	double obterValorTotal() {
		double total = 0;
		
		for(Item item: itens) {
			total += item.quantidade * item.preco;
			
		}
				
		return total; 
	}
			
}
