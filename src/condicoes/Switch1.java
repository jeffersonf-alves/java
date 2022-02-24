package condicoes;

public class Switch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String faixa = "amarela";
		
		switch(faixa.toLowerCase()) {
			case "preto":
				System.out.print("Preto");
				break;
			case "marron":
				System.out.print("Marrom");
			default:
				System.out.print("Nenhuma");
		}

	}

}
