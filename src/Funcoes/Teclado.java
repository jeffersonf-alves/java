package Funcoes;

import java.util.Scanner;

public class Teclado {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		System.out.printf("Valores digitados: "+a+" "+b+" "+c);

	}

}
