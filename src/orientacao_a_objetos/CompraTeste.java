package orientacao_a_objetos;

public class CompraTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compre c1 = new Compre();
		c1.cliente = "João Pedro";
		
		c1.itens.add(new Item("Caneta", 20, 7.36));
		c1.itens.add(new Item("Borracha", 12, 3.89));
		c1.itens.add(new Item("Caderno", 3, 17.66));
		
		System.out.println(c1.itens.size());
		System.out.println(c1.obterValorTotal());


	}

}
