package arrays_e_collections;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
			
		
		double[] notasAlunos = new double[3];
		double[] notasAlunos2 = {5,4,3,5};
		
		notasAlunos[0] = 6.9;
		notasAlunos[1] = 9;
		notasAlunos[2] = 7.9;
		
		System.out.print(Arrays.toString(notasAlunos)+"\n");
		
		double total = 0;
		for(int i = 0; i < notasAlunos.length; i++) {
			total += notasAlunos[i];
		}
		
		System.out.print(total);

	}

}
