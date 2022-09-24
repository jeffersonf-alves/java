package construtores;

import java.util.Scanner;

public class Construtores {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.next();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		System.out.print("Quantity in Stock: ");
		int quantity = sc.nextInt();
				
	    Product product = new Product(name, price, quantity);
			
			

	}

}
