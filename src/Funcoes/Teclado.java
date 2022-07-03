package Funcoes;

import java.util.Scanner;

public class Teclado {

	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		int c = sc.nextInt();
//		
//		System.out.printf("Valores digitados: "+a+" "+b+" "+c);

		int maiorNumero = max(5, 4, 10);
		showResult(maiorNumero);
		
	}
	
	public static int max(int x, int y,int z) {
		
		int aux;
		if(x > y && x > z) {
			aux = x;
		} else if(y > z) {
			aux = y;
		} else {
			aux = z;
		}
		
		return aux;
	}
	
	public static void showResult(int value) {
		System.out.print(value);
	}

}
