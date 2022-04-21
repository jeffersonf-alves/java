package arrays_e_collections;

public class Usuario {
	
	String nome;
	String email;
	

	public boolean equals(Object obj) {
		
		if(obj instanceof Usuario) {
			Usuario outro = (Usuario) obj;
			
			return super.equals(obj);
		} else {
			return super.equals(obj);
		}
		
	}
}
