package arrays_e_collections;

public class Foreach {

	public static void main(String[] args) {
		
		double[] notas = {9,10, 2, 5};
		
//		for(int i = 0; i < notas.length; i++) {
//			System.out.println(notas[i]);
//		}
//		
		for(double nota: notas) {
			System.out.println(nota);
		}
		
	}

}
