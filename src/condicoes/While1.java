package condicoes;

import java.util.Scanner;

public class While1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		String entrada = "";
		
		while(!entrada.equalsIgnoreCase("sair")) {
			System.out.print("Você diz: ");
			entrada = teclado.nextLine();
		}
		
		teclado.close();
		
	}

}
