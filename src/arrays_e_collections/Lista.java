package arrays_e_collections;

import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {
		
		ArrayList<String> Cursos = new ArrayList<>();
		
		Cursos.add("Programação em Java");
		Cursos.add("Curso de JS");
		Cursos.add("Programação em SQL");
		
		System.out.print(Cursos);
		
//		for (String curso: Cursos) {
//			System.out.println(curso);
//		}
		
		for(int i = 0; i <= Cursos.size(); i++) {
			System.out.print(Cursos.get(i));
		}
		
//		System.out.println("O primeiro curso: " + Cursos.get(0));
//		
//		ArrayList<Usuario> Lista = new ArrayList<>();
	}

}
