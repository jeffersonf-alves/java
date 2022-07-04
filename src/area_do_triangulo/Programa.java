package area_do_triangulo;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double xA, xB, xC, yA, yB, yC;
		
		System.out.println("Entre com as medidas do X: ");
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();
		
		System.out.println("Entre com as medidas do Y: ");
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();
		
		
		double p = (xA + xB + xC) / 2.0;
		double areaX =  Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));
		
		p = (xA + xB + xC) / 2.0;
		double areaY =  Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));
		
		
		
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);
		
		
		if(areaX > areaY) {
			System.out.println("A maior área é a X");
		} else {
			System.out.println("A maior área é a Y");
		}
		
		sc.close();
		
		

	}

}
